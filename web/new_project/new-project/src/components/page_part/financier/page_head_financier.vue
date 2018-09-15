<template>
  <div class="layout" :style="{position: 'fixed', width: '100%',}" style="z-index: 1">
    <p style="text-align: left">{{text}}</p>
    <Menu mode="horizontal" theme="light" @on-select="jump">
      <div class="layout-nav">
        <MenuItem name="1">
          <Icon type="ios-build-outline"></Icon>
          个人中心
        </MenuItem>
        <MenuItem name="2">
          <Icon type="ios-desktop" />
          融资首页
        </MenuItem>
        <MenuItem name="3" >
          <Icon type="md-close-circle" />
          退出登陆
        </MenuItem>
      </div>
    </Menu>
  </div>
</template>

<script>
  export default {
    name: 'page_head',
    data(){
      return{
        text:"",
      }
    },
    methods:{
      jump(name){
        if(name==="1"){
          this.$router.push({
            path: '/financier_user_center'
          })
        }
        else if(name === "2"){
          this.$router.push({
            path: '/financier_main'
          })
        }
        else{
          this.$router.push({
            path: '/'
          })
        }
      }
    }
  }
</script>

<style scoped>
  .layout{
    text-shadow: 0.4em 0.4em 0.5em grey;

    border: 1px solid #d7dde4;
    background: #f5f7f9;
    position: relative;
    border-radius: 4px;
    overflow: hidden;

  }
  .layout-nav{
    width: 420px;
    margin: 0 auto;

    margin-right: 20px;
  }
</style>
