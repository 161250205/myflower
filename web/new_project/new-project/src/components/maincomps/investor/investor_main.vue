<template>
  <div class="layout" style="text-shadow: 0.15em 0.15em 0.5em grey">
    <page_head></page_head>
    <Content :style="{padding: '0 50px',}" style="margin-top:7%;z-index: 0">
      <Card>
        <div style="min-height: 1300px;height: 100%">
          <Tabs :value="tab_name" v-model="tab_name">
            <TabPane label="投资首页" name="name1" >
              <Row>
                <Col span="24">
                  <!--<a>推荐</a><hr>-->
                  <Divider  >
                    <a class="divider" @click="change_name(2,1)">推荐产品</a>
                  </Divider>
                </Col>
              </Row>
              <Row class="row">
                <Col span="6" class="col"><info_brief/></Col>
                <Col span="6" class="col"><info_brief/></Col>
                <Col span="6" class="col"><info_brief/></Col>
                <Col span="6" class="col"><info_brief/></Col>
              </Row>
              <Row>
                <Col span="24" >
                  <Divider class="divider">
                    <a class="divider"  @click="change_name(2,2)">热门产品</a>
                  </Divider>
                </Col>
              </Row>
              <Row class="row">
                <Col span="6" class="col"><info_brief/></Col>
                <Col span="6" class="col"><info_brief/></Col>
                <Col span="6" class="col"><info_brief/></Col>
                <Col span="6" class="col"><info_brief/></Col>
              </Row>
              <Row>
                <Col span="24"  >
                  <Divider class="divider">
                    <a class="divider"  @click="change_name(2,3)">最新产品</a>
                  </Divider>
                </Col>
              </Row>
              <Row class="row">
                <Col span="6" class="col"><info_brief @click="jump"/></Col>
                <Col span="6" class="col"><info_brief/></Col>
                <Col span="6" class="col"><info_brief/></Col>
                <Col span="6" class="col"><info_brief/></Col>
              </Row>
            </TabPane>
            <TabPane label="浏览项目" name="name2" >
              <Row>
                <Col span="13" offset="1" class="col">
                  <RadioGroup v-model="type">
                    <Radio label="金融">
                      <Icon type="logo-yen" />
                      <span>金融</span>
                    </Radio>
                    <Radio label="科技">
                      <Icon type="ios-pulse-outline" />
                      <span>科技</span>
                    </Radio>
                    <Radio label="家电">
                      <Icon type="ios-film" />
                      <span>家电</span>
                    </Radio>
                    <Radio label="美食">
                      <Icon type="logo-windows"></Icon>
                      <span>美食</span>
                    </Radio>
                    <Radio label="设计">
                      <Icon type="ios-document-outline" />
                      <span>设计</span>
                    </Radio>
                    <Radio label="文化">
                      <Icon type="ios-bookmarks" />
                      <span>文化</span>
                    </Radio>
                    <Radio label="公益">
                      <Icon type="ios-water" />
                      <span>公益</span>
                    </Radio>
                    <Radio label="娱乐">
                      <Icon type="ios-musical-notes" />
                      <span>娱乐</span>
                    </Radio>
                  </RadioGroup>
                </Col>
                <Col span="10" class="col">
                  <RadioGroup v-model="scale" style="text-shadow: 0.3em 0.3em 1.5em black;z-index: 0">
                  选择投资额度：
                    <Radio label="小额">小额（<100）</Radio>
                   <Radio label="中额">中额（100-1000）</Radio>
                   <Radio label="大额">大额（>1000）</Radio>
                  </RadioGroup>
                </Col>
              </Row>
              <div>
                <Divider>
                  <Select v-model="sort_type" style="width:200px; text-shadow: 0.15em 0.15em 1em white;border:none;">
                    <Option v-for="item in sort_list" :value="item.value" :key="item.value">{{ item.label }}</Option>
                  </Select>
                </Divider>
                <Row class="row">
                  <Col span="6" class="col">
                    <info_brief/><br>
                    <info_brief/><br>
                    <info_brief/><br>
                  </Col>
                  <Col span="6" class="col">
                    <info_brief/><br>
                    <info_brief/><br>
                    <info_brief/><br>
                  </Col>
                  <Col span="6" class="col">
                    <info_brief/><br>
                    <info_brief/><br>
                    <info_brief/><br>
                  </Col>
                  <Col span="6" class="col">
                    <info_brief/><br>
                    <info_brief/><br>
                    <info_brief/><br>
                  </Col>
                </Row>
                <Page :total="97" simple :page-size="12"/>
              </div>


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
      tab_name:"name1",
      type: '科技',
      scale: '',
      model1:"推荐产品",
      sort_type : "推荐产品",
      sort_list: [
        {
          value: '推荐产品',
          label: '推荐产品'
        },
        {
          value: '最新产品',
          label: '最新产品'
        },
        {
          value: '热门产品',
          label: '热门产品'
        },
      ],

    }
  },
  components: {page_head,bottom_line,info_brief},
  name: 'investor_main',
  methods:{
    change_name(type1,type2){
      console.log(this.tab_name);
      this.tab_name="name1";
      this.sort_type= '推荐产品';
      if(type1===2)this.tab_name = "name2";
      if(type2===3)this.sort_type= '最新产品';
      if(type2===2)this.sort_type= '热门产品';
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
  a{
    color: #222324;
    font-size: 18px;
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
  .row_2{
    min-height: 300px;
    height: 30%;
    max-height:30%
  }
  .info{
    height: 100%;
    width: 80%;
  }
  .divider:hover{
    color: red;
    cursor: pointer;
  }
</style>
