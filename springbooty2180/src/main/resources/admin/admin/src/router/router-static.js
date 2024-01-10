import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import touzilicai from '@/views/modules/touzilicai/list'
    import jiatingshouru from '@/views/modules/jiatingshouru/list'
    import yinxingchuxu from '@/views/modules/yinxingchuxu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import jiatingzhanghu from '@/views/modules/jiatingzhanghu/list'
    import zhichufenlei from '@/views/modules/zhichufenlei/list'
    import shourufenlei from '@/views/modules/shourufenlei/list'
    import jiatingzhichu from '@/views/modules/jiatingzhichu/list'
    import users from '@/views/modules/users/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/touzilicai',
        name: '债务信息',
        component: touzilicai
      }
      ,{
	path: '/jiatingshouru',
        name: '家庭收入',
        component: jiatingshouru
      }
      ,{
	path: '/yinxingchuxu',
        name: '银行储蓄',
        component: yinxingchuxu
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/jiatingzhanghu',
        name: '家庭账户',
        component: jiatingzhanghu
      }
      ,{
	path: '/zhichufenlei',
        name: '支出分类',
        component: zhichufenlei
      }
      ,{
	path: '/shourufenlei',
        name: '收入分类',
        component: shourufenlei
      }
      ,{
	path: '/jiatingzhichu',
        name: '家庭支出',
        component: jiatingzhichu
      }
      ,{
	path: '/users',
        name: '管理员',
        component: users
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
