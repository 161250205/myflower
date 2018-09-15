<template>
  <div class="layout" style="text-shadow: 0.4em 0.4em 0.5em grey">
    <page_head></page_head>
    <Content :style="{padding: '0 50px',}" style="margin-top:7%;z-index: 0">
      <Card style="height: auto;min-height: 700px">
        <Row>
          <Col span="18" push="6">
            <div style="min-height: 400px; margin-top: 5%">
              <div v-if="type===1">
                <user_info></user_info>
              </div>
              <div v-if="type===2">
              </div>
              <div v-if="type===3">
              </div>
            </div>
          </Col>
          <Col span="6" pull="18">
            <div style="min-height: 400px;">
              <Menu theme="light" active-name="1" style="width: 18%;z-index: 0;min-height: 700px;min-width: 200px">
                <MenuGroup title="个人信息">
                  <MenuItem name="1"  @click.native="change_type(1)">
                    <Icon type="md-document" />
                    详细信息
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
  import user_info from '../../page_part/financier/financier_user_info'
    export default {
      components: {page_head,bottom_line,user_info},
        name: "financier_user_center",
      data(){
        return{
          type:1,
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
  }
</style>
