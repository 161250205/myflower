<template>
  <Form  :label-width="80" :label-position="left" style="padding-right: 20px;font-size: 15px;text-align: left;">
    <FormItem label="产品名称：" prop="product_name">
      <i-input clearable type="text" placeholder="请输入产品名称" class="item" style="max-width: 60%;"></i-input>
    </FormItem>
    <FormItem label="产品类别：" prop="type">
      <RadioGroup v-model="type" class="item">
        <Radio label="科技">
          <span>科技</span>
        </Radio>
        <Radio label="家电">
          <span>家电</span>
        </Radio>
        <Radio label="美食">
          <span>美食</span>
        </Radio>
        <Radio label="设计">
          <span>设计</span>
        </Radio>
        <Radio label="文化">
          <span>文化</span>
        </Radio>
        <Radio label="公益">
          <span>公益</span>
        </Radio>
        <Radio label="娱乐">
          <span>娱乐</span>
        </Radio>
      </RadioGroup>
    </FormItem>
    <FormItem label="产品简介：" prop="product_intro">
      <i-input clearable type="textarea" :rows="3" placeholder="请输入产品简介" class="item" style="max-width: 60%;"></i-input>
    </FormItem>
    <FormItem label="起投额度：" prop="scale">
      <RadioGroup v-model="scale" class="item">
        <Radio label="小额">小额（<100）</Radio>
        <Radio label="中额">中额（100-1000）</Radio>
        <Radio label="大额">大额（>1000）</Radio>
      </RadioGroup>
    </FormItem>
    <FormItem label="目标金额：" prop="target_total" >
      <InputNumber  :max="10000000000" :min="1000" :step="1000"  style="width:auto"  class="item_input" ></InputNumber>
    </FormItem>
    <FormItem label="预计收益率" prop="return_rate_expect" >
      <InputNumber  :max="100" :min="0" :step="0.0001"  style="width:auto"  class="item_input" ></InputNumber>
    </FormItem>
    <FormItem label="偿债能力：" prop="ability">
      <i-input clearable type="text" placeholder="" class="item" style="max-width: 60%;"></i-input>
    </FormItem>
    <FormItem label="偿债时间：" prop="time_return_expect">
      <Select v-model="model1" style="width:200px" class="item_select" placeholder="">
        <i-option v-for="item in time_list" :value="item.value" :key="item.value">{{ item.label }}</i-option>
      </Select>
    </FormItem>

      <Button type="primary" style="margin-left: 36%" label="large" @click="start()">创建产品</Button>

  </Form>
</template>

<script>

    export default {
        name: "financier_start_new_project",
      data(){
          return {
            time_list: [
              {
                value: '1',
                label: '一个月'
              },
              {
                value: '2',
                label: '三个月'
              },
              {
                value: '3',
                label: '六个月'
              },
              {
                value: '4',
                label: '一年'
              },
              {
                value: '5',
                label: '三年'
              },
              {
                value: '6',
                label: '五年'
              }
            ],
          }
      },
      methods:{
          start(){
            this.$Message.success('创建成功');
            this.$parent.$parent.$parent.$parent.$parent.type=1;
          }
      }
    }
</script>

<style scoped>
  .item{
    margin-left: 7%;
  }
  .item_select{
    margin-left: 7%;
    min-width: 45%;
  }
  .item_input{
    margin-left: 7%;
    min-width: 45%;
  }
</style>
