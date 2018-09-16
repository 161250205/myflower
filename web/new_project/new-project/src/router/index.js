/*eslint-disable*/
import Vue from 'vue'
import Router from 'vue-router'
import login_financier from '../components/maincomps/financier/login_financier'
import login_investor from '../components/maincomps/investor/login_investor'
import home_page from '../components/maincomps/home_page'
import financier_main from '../components/maincomps/financier/financier_main'
import investor_main from '../components/maincomps/investor/investor_main'
import investor_user_center from '../components/maincomps/investor/investor_user_center'
import invest_info from '../components/maincomps/investor/invest_info'
import financier_user_center from '../components/maincomps/financier/financier_user_center'
//login_investor
//financier_main
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/invest_info',
      name: 'invest_info',
      component:invest_info
    },
    {
      path: '/',
      name: 'home_page',
      component: home_page
    },
    {
      path: '/login_financier',
      name: 'login_financier',
      component: login_financier
    },
    {
      path: '/financier_main',
      name: 'financier_main',
      component: financier_main
    },
    {
      path: '/financier_user_center',
      name: 'financier_user_center',
      component: financier_user_center
    },
    {
      path: '/investor_main',
      name: 'investor_mainr',
      component: investor_main
    },
    {
      path: '/login_investor',
      name: 'login_investor',
      component: login_investor
    },
    {
      path: '/investor_user_center',
      name: 'investor_user_center',
      component: investor_user_center
    },

  ]
})
