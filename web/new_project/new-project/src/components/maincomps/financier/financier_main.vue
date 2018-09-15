<template>
    <div class="layout" style="text-shadow: 0.2em 0.05em 0.5em grey">
    <page_head></page_head>
    <Content :style="{padding: '0 50px',}" style="margin-top:7%;z-index: 0">
      <Card>
        <Row>
          <Col span="18" push="6">
            <div style="min-height: 400px; margin-top: 5%">
              <div v-if="type===1">
                <financier_ongoing></financier_ongoing>
              </div>
              <div v-if="type===2">
                <financier_finished></financier_finished>
              </div>
              <div v-if="type===3">
                <financier_start></financier_start>
              </div>
            </div>
          </Col>
          <Col span="6" pull="18">
            <div style="min-height: 400px;">
              <Menu theme="light" active-name="1" style="width: 18%;z-index: 0;min-height: 700px;min-width: 200px">
                <MenuGroup title="产品管理">
                  <MenuItem name="1"  @click.native="change_type(1)">
                    <Icon type="md-document" />
                    进行中
                  </MenuItem>
                  <MenuItem name="2"  @click.native="change_type(2)">
                    <Icon type="md-chatbubbles" />
                    已结束
                  </MenuItem>
                  <MenuItem name="3"  @click.native="change_type(3)">
                    <Icon type="md-aperture" />
                    发起众筹
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
  import page_head from '../../page_part/financier/page_head_financier'
  import bottom_line from '../../page_part/bottom_line'
  import financier_ongoing from '../../page_part/financier/financier_ongoing'
  import financier_finished from '../../page_part/financier/financier_finished'
  import financier_start from '../../page_part/financier/financier_start_new_project'
export default {
  name: 'financier_main',
  components: {page_head,bottom_line,financier_ongoing,financier_finished,financier_start},
  data () {
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

  }
  p{
    color: cyan;
    font-size: 21px;
    text-shadow: 0.15em 0.15em 1em black
  }
</style>
