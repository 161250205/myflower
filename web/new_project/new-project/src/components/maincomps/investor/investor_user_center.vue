<template>
  <div class="layout">
    <page_head></page_head>
    <Content :style="{padding: '0 50px',}" style="margin-top:7%;z-index: 0">
      <Card style="height: auto">
        <Row>
          <Col span="18" push="6">
            <div style="min-height: 400px; margin-top: 5%">
              <div v-if="type===1">
                <investor_user_info style="min-height: 400px;"></investor_user_info>
              </div>
              <div v-if="type===2">
                <set_invest style="max-width: 90%;"></set_invest>
              </div>
              <div v-if="type===3">
                <invest_list></invest_list>
              </div>
            </div>
          </Col>
          <Col span="6" pull="18">
            <div style="min-height: 400px;">
              <Menu theme="light" active-name="1" style="width: 18%;z-index: 0;min-height: 700px;min-width: 200px">
                <MenuGroup title="个人信息">
                  <MenuItem name="1"  @click.native="change_type(1)">
                    <Icon type="md-document" />
                    个人信息管理
                  </MenuItem>
                  <MenuItem name="2"  @click.native="change_type(2)">
                    <Icon type="md-chatbubbles" />
                    投资偏好设置
                  </MenuItem>
                </MenuGroup>
                <MenuGroup title="我的投资">
                  <MenuItem name="3"  @click.native="change_type(3)">
                    <Icon type="md-heart" />
                    产品信息
                  </MenuItem>
                </MenuGroup>
              </Menu>
            </div>
          </Col>
        </Row>
      </Card>
    </Content>
    <bottom_line></bottom_line>
  </div>
</template>

<script>
import page_head from '../../page_part/investor/page_head_investor'
import investor_user_info from '../../page_part/investor/investor_user_info'
import set_invest from '../../page_part/investor/set_invest'
import invest_list from '../../page_part/investor/invest_list'
import bottom_line from '../../page_part/bottom_line'
export default {
  components: {page_head,investor_user_info,set_invest,invest_list,bottom_line},
        name: "investor_user_center",
  data() {
    return {
      type:1
    }
  },
  methods:{
    change_type(i){
      this.type = i;
    }
  }
}
</script>

<style scoped>
  .layout{
    border: 1px solid #d7dde4;
    background: #f5f7f9;
    position: relative;
    border-radius: 4px;
    overflow: hidden;
    text-align: left;
    text-shadow: 0.15em 0.15em 0.5em grey
  }
</style>
