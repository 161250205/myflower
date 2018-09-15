<template>
<div style="text-align:left;">
  <p>用户名:{{username}}</p><br><br>
  <p>账户余额:{{account_left}}元</p><br><br>
  <p>信誉积分:{{credit}}</p>
</div>
</template>

<script>
    export default {
        name: "investor_user_info",
      data(){
          return{
            username:"test",
            account_left:"123",
            credit:0
          }
      }
    }
</script>

<style scoped>

</style>
