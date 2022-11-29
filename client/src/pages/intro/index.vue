<template>
  <el-carousel indicator-position="outside">
    <el-carousel-item>
      <div class="bg">
        <img :src="bg1" class="bg-pic" />
        <div class="bg-content">
          福潇物业——智慧物业管理平台
          <br />
          <i class="bg-intro">
            物管王是一套成熟的智慧社区物业管理平台，国内第一家微GIS图形化开发平台，对物业小区、门面房商铺、广告位、停车场和车位等物业的信息化综合管理;实现从物业住户资料、收费、报修、投诉和办公OA等功能；软件具备电脑端和移动手机端APP，具备在线缴费、在线报修投诉功能
          </i>
        </div>
      </div>
    </el-carousel-item>
    <el-carousel-item>
      <div class="bg">
        <img :src="bg2" class="bg-pic" />
        <div class="bg-content">
          掌上福潇——广受好评的业主服务平台
          <br />
          <i class="bg-intro">
            物管王是一套成熟的智慧社区物业管理平台，国内第一家微GIS图形化开发平台，对物业小区、门面房商铺、广告位、停车场和车位等物业的信息化综合管理;实现从物业住户资料、收费、报修、投诉和办公OA等功能；软件具备电脑端和移动手机端APP，具备在线缴费、在线报修投诉功能
          </i>
        </div>
      </div>
    </el-carousel-item>
    <!-- <el-carousel-item>
      <div class="bg">
        <img :src="bg3" class="bg-pic" />
        <div class="bg-content">123</div>
      </div>
    </el-carousel-item> -->
  </el-carousel>
  <div class="major">
    <div class="major-title">主营物业产品</div>
    <div class="major-split"></div>
    <div class="major-intro">
      目标：把物业软件做"精”达到世界同类产品中的极致，把服务做到用户满意
      用专业，专一的匠人精神雕琢开发多项目多业态的物业综合管理平台
    </div>
    <div class="major-content">
      <div class="major-item">
        <el-card class="box-card">
          <template #header>
            <div class="card-header">
              <el-icon>
                <List />
              </el-icon>

              <el-button class="button" text>Operation button</el-button>
            </div>
          </template>
          <div v-for="o in 4" :key="o" class="text item">{{ 'List item ' + o }}</div>
        </el-card>
      </div>
            <div class="major-item">
              <el-card class="box-card">
                <template #header>
                  <div class="card-header">
                    <el-icon>
                      <List />
                    </el-icon>
            
                    <el-button class="button" text>Operation button</el-button>
                  </div>
                </template>
                <div v-for="o in 4" :key="o" class="text item">{{ 'List item ' + o }}</div>
              </el-card>
            </div>
                  <div class="major-item">
                    <el-card class="box-card">
                      <template #header>
                        <div class="card-header">
                          <el-icon>
                            <List />
                          </el-icon>
                  
                          <el-button class="button" text>Operation button</el-button>
                        </div>
                      </template>
                      <div v-for="o in 4" :key="o" class="text item">{{ 'List item ' + o }}</div>
                    </el-card>
                  </div>
                        <div class="major-item">
                          <el-card class="box-card">
                            <template #header>
                              <div class="card-header">
                                <el-icon>
                                  <List />
                                </el-icon>
                        
                                <el-button class="button" text>Operation button</el-button>
                              </div>
                            </template>
                            <div v-for="o in 4" :key="o" class="text item">{{ 'List item ' + o }}</div>
                          </el-card>
                        </div>
    </div>

  </div>
  <div class="servant">
    <div class="servant-title">提供服务</div>
    <div class="servant-split"></div>
    <div class="servant-intro">
      公司提供从售前服务到售后一条龙服务模式,每个客户都能享受VIP贵宾服务待遇
    </div>
    <div class="servant-content">
      <div class="servant-item">
        <el-icon :size="30" color="red">
          <DocumentAdd />
        </el-icon>
        <div>可视化数据生成PDF</div>
      </div>
      <div class="servant-item">
        <el-icon :size="30" color="red">
          <Lightning />
        </el-icon>
        <div>可视化数据生成PDF</div>
      </div>
      <div class="servant-item">
        <el-icon :size="30" color="red">
          <Sunny />
        </el-icon>
        <div>可视化数据生成PDF</div>
      </div>
      <div class="servant-item">
        <el-icon :size="30" color="red">
          <Key />
        </el-icon>
        <div>可视化数据生成PDF</div>
      </div>
      <div class="servant-item">
        <el-icon :size="30" color="red">
          <Phone />
        </el-icon>
        <div>可视化数据生成PDF</div>
      </div>
    </div>
  </div>

  <div class="cta">
    <div>移动物业开发 <i class="cta-i">与世界同步</i></div>
  </div>

  <div class="about">
    <div class="about-title">关于我们</div>
    <div class="about-split"></div>
    <div class="about-intro">打造世界具核心竞争力的物业软件供应商</div>
  </div>
  <div class="contact">
    <div class="contact-title">联系方式</div>
    <div class="contact-split"></div>
    <div class="contact-intro">
      可以通过QQ进行联系，方便远程演示和传递文档资料，也可以直接电话联系
    </div>
  </div>
</template>

<script setup lang="ts">
import bg1 from "/bg/bg1.png";
import bg2 from "/bg/bg2.png";
import bg3 from "/bg/bg3.png";
import { DocumentAdd, Lightning, Phone, Sunny, Key, List } from "@element-plus/icons-vue";

const bgItems = [bg1, bg2, bg3];
</script>

<style scoped lang="less">
.flex-center {
  display: flex;
  align-items: center;
  justify-content: center;
}

.publicContent {
  width: 100%;
  height: auto;
  margin: 10px 0;
  .flex-center();
  flex-direction: column;
}

.bg {
  width: 100%;
  height: 100%;

  .bg-pic {
    width: 100%;
    height: 100%;
    position: absolute;
  }

  .bg-content {
    z-index: 999;
    font-size: 30px;
    left: 15%;
    top: 15%;
    width: 700px;
    position: absolute;

    .bg-intro {
      font-size: 12px;
      color: antiquewhite;
    }
  }
}

.major {
  .major-title {
    text-align: center;
    font-size: 26px;
  }

  .major-split {
    width: 14px;
    height: 14px;
    border-radius: 50%;
    background-color: rgb(230, 20, 20);
    .flex-center();
  }

  .major-split::before {
    content: "———————————";
    margin-right: 7px;
  }

  .major-split:after {
    content: "———————————";
    margin-left: 7px;
  }

  .major-intro {
    width: 600px;
    text-align: center;
  }
  .major-content{
    width: 80%;
    height: auto;
    display: flex;
    flex-wrap: wrap;
    .major-item{
      width: 40%;
      margin: 5%;
    }
  }

  .publicContent();
}

.servant {
  .servant-title {
    text-align: center;
    font-size: 26px;
  }

  .servant-split {
    width: 14px;
    height: 14px;
    border-radius: 50%;
    background-color: rgb(230, 20, 20);
    .flex-center();
  }

  .servant-split::before {
    content: "———————————";
    margin-right: 7px;
  }

  .servant-split:after {
    content: "———————————";
    margin-left: 7px;
  }

  .servant-intro {
    width: 600px;
    text-align: center;
  }

  .servant-content {
    width: 80%;
    margin: 20px 10%;
    display: flex;
    align-items: center;
    justify-content: space-between;

    .servant-item {
      text-align: center;
    }
  }

  .publicContent();
}

.about {
  .about-title {
    text-align: center;
    font-size: 26px;
  }

  .about-split {
    width: 14px;
    height: 14px;
    border-radius: 50%;
    background-color: rgb(230, 20, 20);
    .flex-center();
  }

  .about-split::before {
    content: "———————————";
    margin-right: 7px;
  }

  .about-split:after {
    content: "———————————";
    margin-left: 7px;
  }

  .about-intro {
    width: 600px;
    text-align: center;
  }

  .publicContent();
}

.contact {
  .contact-title {
    text-align: center;
    font-size: 26px;
  }

  .contact-split {
    width: 14px;
    height: 14px;
    border-radius: 50%;
    background-color: rgb(230, 20, 20);
    .flex-center();
  }

  .contact-split::before {
    content: "———————————";
    margin-right: 7px;
  }

  .contact-split:after {
    content: "———————————";
    margin-left: 7px;
  }

  .contact-intro {
    width: 600px;
    text-align: center;
  }

  .publicContent();
}

.cta {
  background: black;
  height: 200px;
  font-size: 44px;
  color: aliceblue;
  .flex-center();

  .cta-i {
    color: red;
    font-size: 44px;
  }
}
</style>
