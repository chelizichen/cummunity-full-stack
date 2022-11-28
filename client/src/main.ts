import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import {createPinia} from 'pinia'
import router from './router'
import element from 'element-plus'
import 'element-plus/dist/index.css'

createApp(App)
  .use(element)
  .use(createPinia())
  .use(router)
  .mount('#app')
