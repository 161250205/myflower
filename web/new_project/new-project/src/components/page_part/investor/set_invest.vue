<template>
  <Form  :label-width="80" :label-position="left" style="padding-right: 20px;font-size: 15px">
    <FormItem label="目标收益率" prop="return_rate">
      <InputNumber  :max="100" :min="1" :step="0.1"  style="width:auto"  class="item"></InputNumber>
    </FormItem>
    <FormItem label="风险预期：" prop="risk">
      <RadioGroup v-model="scale" class="item">
        <Radio label="稳健">稳健理财</Radio>
        <Radio label="冒险">富贵险中求</Radio>
      </RadioGroup>
    </FormItem>
    <FormItem label="偏好类别：" prop="type">
      <CheckboxGroup v-model="type" class="item">
        <Checkbox label="科技">
          <span>科技</span>
        </Checkbox>
        <Checkbox label="家电">
          <span>家电</span>
        </Checkbox>
        <Checkbox label="美食">
          <span>美食</span>
        </Checkbox>
        <Checkbox label="设计">
          <span>设计</span>
        </Checkbox>
        <Checkbox label="文化">
          <span>文化</span>
        </Checkbox>
        <Checkbox label="公益">
          <span>公益</span>
        </Checkbox>
        <Checkbox label="娱乐">
          <span>娱乐</span>
        </Checkbox>
      </CheckboxGroup>
    </FormItem>
    <FormItem label="回报期限：" prop="return_rate">
      <Select v-model="model1" style="width:200px" class="item" placeholder="">
        <i-option v-for="item in time_list" :value="item.value" :key="item.value">{{ item.label }}</i-option>
      </Select>
    </FormItem>
    <FormItem label="起投额度：" prop="scale">
      <RadioGroup v-model="scale" class="item">
        <Radio label="小额">小额（<100）</Radio>
        <Radio label="中额">中额（100-1000）</Radio>
        <Radio label="大额">大额（>1000）</Radio>
      </RadioGroup>
    </FormItem>
    <FormItem label="排序" prop="level">
      <CheckboxGroup v-model="level_list" class="item" >
        <Checkbox label="目标收益率">
          <span>目标收益率</span>
        </Checkbox>
        <Checkbox label="风险预期">
          <span>风险预期</span>
        </Checkbox>
        <Checkbox label="偏好类别">
          <span>偏好类别</span>
        </Checkbox>
        <Checkbox label="回报期限">
          <span>回报期限</span>
        </Checkbox>
        <Checkbox label="起投额度">
          <span>起投额度</span>
        </Checkbox>
      </CheckboxGroup>
      <br>
      <p class="item">当前排序：{{level_list}}</p>
      <br>
      <Button type="primary" style="margin-left: 15%" label="large" @click="save_set()">保存所选</Button>
    </FormItem>
  </Form>

</template>

<script>
    export default {
        name: "set_invest",
      data(){
          return{
            level_string:"",
            model1: '',
            level_list:[

            ],
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
        save_set(){
          this.$Message.success('保存成功');
        }
      }
    }
</script>

<style scoped>
  .item{
    margin-left: 7%;
  }
</style>
