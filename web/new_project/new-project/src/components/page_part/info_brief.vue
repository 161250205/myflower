<template>
    <div @click="jump">
      <img :src="path"  src = '../../assets/logo.png'>
      <br><br><br>
      <p class="title">{{title}}</p>
      <p>{{intro}}</p>
      <br><br><br>
    </div>
</template>

<script>
    export default {
        name: "info_brief",
      data(){
          return {
            path:'../../assets/logo.png',
            intro:'testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest',
            url:'',
            title:'title_test'

          }
      },
      methods:{
          set_info(path,intro,title,url){
            this.path = path
            this.intro = intro
          },
          jump(){
            // this.$router.push('/');
          }
      }
    }
</script>

<style scoped>
  div:hover{
    border: 1px solid orangered;
    cursor:pointer

  }
  div{
    margin-left: 3%;
    margin-right: 3%;
    border: 1px solid #e2e3e4;
  }
  img{
    width: 100%;
    height: 80%;
    border: 1px solid #e2e3e4;
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
