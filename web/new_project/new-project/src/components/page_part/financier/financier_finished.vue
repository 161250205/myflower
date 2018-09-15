<template>
  <div style="text-align:left;">
    <Table class="table_class" :columns="columns1" :data="data2" style="z-index: 0" stripe></Table>
    <Modal v-model="modal2" width="360">
      <p slot="header" style="color:#00e;text-align:center">
        <Icon type="ios-information-circle"></Icon>
        <span>产品详细信息</span>
      </p>
      <div style="text-align:left" class="p_class">
        <p>产品名称：{{product_name}}</p><br>
        <p>产品类别：{{type}}</p><br>
        <p>产品简介：{{product_intro}}</p><br>
        <p>总计金额：{{total}}</p><br>
        <p>发起时间：{{time_start}}</p><br>
        <p>偿债时间：{{time_return_expect}}</p><br>
        <p>状态：{{status}}</p><br>
        <p>预计收益率：{{return_rate_expect}}</p><br>
        <p >偿债能力：{{ability}}</p><br>
        <p>信誉情况:{{credit}}</p>

      </div>
      <div slot="footer">
        <Button type="primary" size="large" long  @click="close_modal">返回</Button>
      </div>
    </Modal>
  </div>
</template>

<script>
    export default {
        name: "financier_finished",
      data(){
        return{
          product_name:'123',
          type:'312',
          product_intro:'',
          scale:'',
          target_total:'',
          return_rate_expect:'',
          ability:'',
          time_return_expect:'',
          time_start:'',
          total:'',
          credit:'',
          status:'',
          modal2:false,
          columns1: [
            {
              title: '产品名称',
              key: 'product_name'
            },
            {
              title: '总金额',
              key: 'total'
            },
            {
              title: '发起时间',
              key: 'time_start'
            },
            {
              title: '偿付时间',
              key: 'time_return_expect'
            },
            {
              title: '状态',
              key: 'status'
            },
            {
              title:'查看详情',
              width: 150,
              align: 'center',
              render: (h, params) => {
                return h('div', [
                  h('Button', {
                    props: {
                      type: 'primary',
                      size: 'small'
                    },
                    style: {
                      marginRight: '5px'
                    },
                    on: {
                      click: () => {
                        this.show_project_info(params.index)
                      }
                    }
                  }, '详情')
                ]);
              }
            }
          ],
          data2: [
            {
              product_name:"产品1",
              total:"2222222",
              time_start:"111",
              time_return_expect:"333",
              status:"未偿付",
            },
            {
              product_name:"产品2",
              total:"22213122",
              time_start:"114241",
              time_return_expect:"31433",
              status:"未偿付",
            },
            {
              product_name:"产品3",
              total:"22224222",
              time_start:"15111",
              time_return_expect:"333",
              status:"已偿付",
            },

          ]
        }
      },
      methods:{
          close_modal(){
            this.modal2=false;
          },
          show_project_info(index){
            this.modal2 = true;
            this.product_name = '123';
            this.type = index;
            this.product_intro = index;
            this.scale = index;
            this.target_total = index;
            this.return_rate_expect = index;
            this.ability = index;
            this.time_return_expect = index;
            this.time_start = index;
            this.total = index;
            this.credit = index;
            this.status = index
          }
      }
    }
</script>

<style scoped>
  .table_class{
    height: auto;
    max-height: 80%;
    left: -5%;
  }
  .p_class{
    font-size: 13px;
    text-shadow: 0.15em 0.15em 1em grey;
  }
</style>
