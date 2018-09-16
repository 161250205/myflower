<template>
  <div class="layout">
    <page_head></page_head>
    <Content :style="{padding: '0 50px',}" style="margin-top:7%;z-index: 0">
      <Card style="height: auto">
        <div style="min-height: 500px;height: 100%">
          <div style="margin-left: 3%;">
            <Row :gutter="16">

              <Col offset="2" span="10">
                <img :src="path"  src = '../../../assets/logo.png'>
              </Col>
              <Col span="12" >
                <p class="title">{{title}}</p>
                <p>起投额度：{{scale}}</p>
                <p>收益率：{{return_rate}}</p>
                <p>产品类别：{{type}}</p>
                <p>风险：{{risk}}</p>
                <p>偿债时间：{{return_time}}</p>
                <p>截止日期：{{end_time}}</p>
                <p>产品简介：{{intro}}</p>
                <br>
                <Row :gutter="16">
                  <Col span = "6" offset="6"><Button type="primary" @click="change_type">支持此产品</Button></Col>
                  <Col span = "12"><Button type="error" @click="return_last_page">返回上页</Button></Col>
                </Row>
              </Col>
            </Row>

          </div>
        </div>
      </Card>
    </Content>
    <Modal
      title="Title"
      v-model="modal7"
      :closable="false">
      <input-number style="margin-left: 15%;" :on-change="set_return_sum" v-model="sum"></input-number>
      <p>您的预计回报是{{return_sum}}</p>
    </Modal>
    <bottom_line></bottom_line>
  </div>
</template>

<script>
  import page_head from '../../page_part/investor/page_head_investor'
  import info_detail from '../../page_part/info_detail'
  import set_invest from '../../page_part/investor/set_invest'
  import invest_list from '../../page_part/investor/invest_list'
  import bottom_line from '../../page_part/bottom_line'
  export default {
    components: {page_head,info_detail,set_invest,invest_list,bottom_line},
    name: "invest_info",
    data() {
      return {
        type:1,
        title:"测试品",
        intro:"这是一个测试用的产品",
        scale:"小额(<100)",
        return_rate:"约5%",
        type:"金融",
        risk:"低",
        return_time:"2018/01/30",
        end_time:"2018/12/31",
        modal7:false,
        return_sum:0,
        sum:0
      }
    },
    methods:{
      return_last_page(){
        this.$router.go(-1)
      },
      change_type(i){
        this.modal7=true;
      },
      set_return_sum(i){
        this.return_sum = 0.05*this.sum
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
  img{
    width: 75%;
    height: 75%;
  }
  .title{
    font-size: 25px;
    font-weight: bolder;
    text-align: center;
  }
  .title:hover{
    color: red;
  }
  p{
    text-align: left;
    font-size: 15px ;
    margin-left: 15%;
    margin-right: 15%;
    word-wrap: break-word;
    word-break: break-all;
    overflow: hidden;
  }
</style>
