<template>
  <div class="loginBg">
    <p >New Crowdfunding</p>
    <Button class="to_Button" type="info" style="top:30%;" to="/login_investor"> 投资入口</Button>
    <Button class="to_Button" type="success" style="top:55%;" to="/login_financier">融资入口</Button>
  </div>
</template>

<script>
export default {
  name: 'home_page'
}
</script>

<style scoped>
  p{
    /*max-width: 100%;*/
    /*max-height: 100%;*/
    color: #2e0298;
    font-size: 65px;
    position: absolute;
    top: 40%;
    left: 10%;
    text-shadow: 10px 10px 5px #888888;
  }
  .to_Button{
    /*max-width: 100%;*/
    /*max-height: 100%;*/
    font-size: 35px;
    position: absolute;
    min-width: 21%;
    left: 62%;
    color:#eee;
    box-shadow: 10px 10px 5px #888888;
  }
  .loginBg {
    width: 100%;
    height: 100%;
    background-image: url('../../assets/background.jpg');
    background-repeat: no-repeat;
    background-position: center center;
    /*position: relative;*/
    /*background-attachment: absolute;*/
    background-size:100%100%;
    /*-webkit-background-size:cover;*/
    /*-moz-background-size:cover;*/
  }
</style>
