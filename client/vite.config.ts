import path from 'path'
import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [vue()],
  server: {
    proxy: {
      'api': {
        target:"localhost:8080",
        rewrite:(path)=>path.replace(/^\/api/,"")
      }
    }
  },
  resolve: {
    alias: {
      "@":path.resolve("./src")
    }
  }
})
