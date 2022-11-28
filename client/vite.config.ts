import path from 'path'
import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [vue()],
  server: {
    proxy: {
      "/server": {
        target: `http://localhost:8080`,
        changeOrigin: true,
        rewrite: (path) => path.replace(/^\/server/, ""),
      },
    },
    port: 3000,
  },
  resolve: {
    alias: {
      "@": path.resolve("./src"),
    },
  },
});
