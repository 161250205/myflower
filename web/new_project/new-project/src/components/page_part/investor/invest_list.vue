<template>
<div>
  <Table :columns="columns1" :data="data2" style="z-index: 0" stripe class="table_c"></Table>
</div>
</template>

<script>
    export default {
        name: "invest_list",
      data () {
        return {
          columns1: [
            {
              title: '产品名称',
              key: 'name'
            },
            {
              title: '状态',
              key: 'position'
            },
            {
              title: '金额',
              key: 'invest'
            },
            {
              title: '收益',
              key: 'return_until_now'
            }
          ],
          data2: [
            {
              name:"产品1",
              position:"已结束",
              invest:"321",
              return_until_now:"123",
            },
          ]
        }
      },
    }
</script>

<style scoped>

  .table_c{
    height: auto;
    width: auto;
  }
</style>
