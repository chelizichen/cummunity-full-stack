import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import {createPinia} from 'pinia'
import router from './router'
import element from 'element-plus'
import 'element-plus/dist/index.css'

import * as ElementPlusIconsVue from "@element-plus/icons-vue";

const app = createApp(App);
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
  app.component(key, component);
}

const pinia = createPinia()

const setupAll = async () => {
  app.use(element).use(pinia).use(router).mount("#app");
}

setupAll()
