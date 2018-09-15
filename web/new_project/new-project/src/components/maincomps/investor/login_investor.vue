<template>
  <div class="loginBg">
    <p >投资入口</p>
    <a href="/">首页</a>
    <Card class="login_Card" >
      <br>
      <Form ref="formInline" :model="formInline" :rules="ruleInline" inline>
        <FormItem prop="user">
          <i-input type="text" v-model="formInline.user" placeholder="用户名" style="width: 100%">
          <Icon type="ios-person-outline" slot="prepend"></Icon>
          </i-input>
        </FormItem>
        <br><br>
        <FormItem prop="password">
          <i-input type="password" v-model="formInline.password" placeholder="密码">
          <Icon type="ios-lock-outline" slot="prepend"></Icon>
          </i-input>
        </FormItem>
        <br><br>
        <FormItem>
          <Button type="primary" @click="handleSubmit('formInline')">登陆</Button>
        </FormItem>
      </Form>
    </Card>
  </div>
</template>

<script>
export default {
  name: 'login_investor',
  data () {
    return {
      formInline: {
        user: '',
        password: ''
      },
      ruleInline: {
        user: [
          { required: true, message: 'Please fill in the user name', trigger: 'blur' }
        ],
        password: [
          { required: true, message: 'Please fill in the password.', trigger: 'blur' },
          { type: 'string', min: 6, message: 'The password length cannot be less than 6 bits', trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    handleSubmit (name) {
      this.$refs[name].validate((valid) => {
        if (valid) {
          this.$router.push({
            path: '/investor_main'
          })
        } else {
          this.$Message.error('Fail!')
        }
      })
    }
  }
}
</script>

<style scoped>
  FormItem{
    height: 100px;
  }
  p{
    /*max-width: 100%;*/
    /*max-height: 100%;*/
    color: #2e0298;
    font-size: 65px;
    position: absolute;
    top: 10%;
    left: 10%;
    text-shadow: 10px 10px 5px #888888;
  }
  .login_Card{
    opacity:0.75;
    top:35%;
    left: 35%;
    position: absolute;
    height: 35%;
    width: 30%;
    box-shadow: 10px 10px 5px #888888;
  }
  .loginBg {
    width: 100%;
    height: 100%;
    background-image: url('../../../assets/background.jpg');
    background-repeat: no-repeat;
    background-position: center center;
    /*position: relative;*/
    /*background-attachment: absolute;*/
    background-size:100%100%;
    /*-webkit-background-size:cover;*/
    /*-moz-background-size:cover;*/
  }
  a{
    color: #2e0298;
    position: absolute;left: 80%;font-size: 25px;
    top:10%;text-shadow: 0.1em 0.1em 0.2em black
  }
</style>
