<template>
  <div class="layout" style="text-shadow: 0.15em 0.15em 0.5em grey">
    <page_head></page_head>
    <Content :style="{padding: '0 50px',}" style="margin-top:7%;z-index: 0">
      <Card>
        <div style="min-height: 1300px;height: 100%">
          <Tabs value="name1">
            <TabPane label="投资首页" name="name1">
              <Row>
                <Col span="24">
                  <!--<a>推荐</a><hr>-->
                  <Divider>推荐产品</Divider>
                </Col>
              </Row>
              <Row class="row">
                <Col span="6" class="col"><info_brief></info_brief></Col>
                <Col span="6" class="col"> <info_brief></info_brief></Col>
                <Col span="6" class="col"><info_brief></info_brief></Col>
                <Col span="6" class="col"><info_brief></info_brief></Col>
              </Row>
              <Row>
                <Col span="24"  >
                  <Divider>热门产品</Divider></Col>
              </Row>
              <Row class="row">
                <Col span="6" class="col"><info_brief></info_brief></Col>
                <Col span="6" class="col"><info_brief></info_brief></Col>
                <Col span="6" class="col"><info_brief></info_brief></Col>
                <Col span="6" class="col"><info_brief></info_brief></Col>
              </Row>
              <Row>
                <Col span="24"  >
                  <Divider>最新产品</Divider></Col>
              </Row>
              <Row class="row">
                <Col span="6" class="col"><info_brief></info_brief></Col>
                <Col span="6" class="col"><info_brief></info_brief></Col>
                <Col span="6" class="col"><info_brief></info_brief></Col>
                <Col span="6" class="col"><info_brief></info_brief></Col>
              </Row>
            </TabPane>
            <TabPane label="浏览项目" name="name2" >
              <Row class="row">
                <Col span="18" class="col">
                  <RadioGroup v-model="phone">
                    <Radio label="科技">
                      <Icon type="ios-pulse-outline" />
                      <span>科技</span>
                    </Radio>
                    <Radio label="家电">
                      <Icon type="logo-android"></Icon>
                      <span>家电</span>
                    </Radio>
                    <Radio label="美食">
                      <Icon type="logo-windows"></Icon>
                      <span>美食</span>
                    </Radio>
                    <Radio label="设计">
                      <Icon type="logo-android"></Icon>
                      <span>设计</span>
                    </Radio>
                    <Radio label="文化">
                      <Icon type="logo-windows"></Icon>
                      <span>文化</span>
                    </Radio>
                    <Radio label="公益">
                      <Icon type="logo-android"></Icon>
                      <span>公益</span>
                    </Radio>
                    <Radio label="娱乐">
                      <Icon type="logo-windows"></Icon>
                      <span>娱乐</span>
                    </Radio>
                  </RadioGroup>
                </Col>
                <Col span="6" class="col"></Col>
              </Row>



            </TabPane>
            <!--<TabPane label="标签三" name="name3">标签三的内容</TabPane>-->
          </Tabs>
          <!--<CheckboxGroup v-model="type">-->
            <!--<Checkbox label="科技">-->
              <!--<span>科技</span>-->
            <!--</Checkbox>-->
            <!--<Checkbox label="家电">-->
              <!--<span>家电</span>-->
            <!--</Checkbox>-->
            <!--<Checkbox label="美食">-->
              <!--<span>美食</span>-->
            <!--</Checkbox>-->
            <!--<Checkbox label="设计">-->
              <!--<span>设计</span>-->
            <!--</Checkbox>-->
            <!--<Checkbox label="文化">-->
              <!--<span>文化</span>-->
            <!--</Checkbox>-->
            <!--<Checkbox label="公益">-->
              <!--<span>公益</span>-->
            <!--</Checkbox>-->
            <!--<Checkbox label="娱乐">-->
              <!--<span>娱乐</span>-->
            <!--</Checkbox>-->
          <!--</CheckboxGroup>-->
          <!--<br>-->
          <!--<RadioGroup v-model="scale" style="text-shadow: 0.3em 0.3em 1.5em black;z-index: 0">-->
            <!--选择投资类别-->
            <!--<Radio label="hui'bao">小额（<100）</Radio>-->
            <!--<Radio label="中额">中额（100-1000）</Radio>-->
          <!--</RadioGroup>-->
          <!--<br><br>-->
          <!--<RadioGroup v-model="scale" style="text-shadow: 0.3em 0.3em 1.5em black;z-index: 0">-->
            <!--选择投资额度：-->
            <!--<Radio label="小额">小额（<100）</Radio>-->
            <!--<Radio label="中额">中额（100-1000）</Radio>-->
            <!--<Radio label="大额">大额（>1000）</Radio>-->
          <!--</RadioGroup>-->

        </div>
        <br><br>
      </Card>
    </Content>
    <bottom_line></bottom_line>
  </div>
</template>

<script>
/*eslint-disable*/
import page_head from '../../page_part/investor/page_head_investor'
import bottom_line from '../../page_part/bottom_line'
import info_brief from  '../../page_part/info_brief'
export default {
  data () {
    return {
      type: '科技',
      scale: '',

    }
  },
  components: {page_head,bottom_line,info_brief},
  name: 'investor_main'
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
  a{
    color: #222324;
    font-size: 21px;
    text-shadow: 0.15em 0.15em 1em black
  }
  .col{
    margin-bottom: 1%;
  }
  .row{

    min-height: 300px;
    height: 30%;
    max-height:30%
    /*border-bottom:1px solid #d7dde4;*/
  }
  .info{
    height: 100%;
    width: 80%;
  }
</style>
