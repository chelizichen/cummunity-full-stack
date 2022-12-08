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

              <el-button class="button" text>福萧物业管理平台</el-button>
            </div>
          </template>
          <div>系统管理</div>
          <div>小区管理</div>
          <div>用户管理</div>
          <div>车位管理</div>
        </el-card>
      </div>
      <div class="major-item">
        <el-card class="box-card">
          <template #header>
            <div class="card-header">
              <el-icon>
                <List />
              </el-icon>

              <el-button class="button" text>福潇私人助手</el-button>
            </div>
          </template>
          <div>自助预约</div>
          <div>智能管家</div>
          <div>私人物业</div>
          <div>智能生活</div>
        </el-card>
      </div>
      <div class="major-item">
        <el-card class="box-card">
          <template #header>
            <div class="card-header">
              <el-icon>
                <List />
              </el-icon>

              <el-button class="button" text>数据展示平台</el-button>
            </div>
          </template>
          <div>展示小区的各种信息</div>
          <div>展示车位方便业主预约</div>
          <div>为后勤人员提供小区状态</div>
          <div>各项服务数据展示</div>
        </el-card>
      </div>
      <div class="major-item">
        <el-card class="box-card">
          <template #header>
            <div class="card-header">
              <el-icon>
                <List />
              </el-icon>

              <el-button class="button" text>后勤管家</el-button>
            </div>
          </template>
          <div>一站式管理</div>
          <div>为业主提供服务</div>
          <div>预约服务</div>
          <div>使后勤服务变得更敏捷</div>

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
        <div>可视化数据生成文档</div>
      </div>
      <div class="servant-item">
        <el-icon :size="30" color="red">
          <Lightning />
        </el-icon>
        <div>闪电下载文档</div>
      </div>
      <div class="servant-item">
        <el-icon :size="30" color="red">
          <Sunny />
        </el-icon>
        <div>实时状态查询</div>
      </div>
      <div class="servant-item">
        <el-icon :size="30" color="red">
          <Key />
        </el-icon>
        <div>智能管家</div>
      </div>
      <div class="servant-item">
        <el-icon :size="30" color="red">
          <Phone />
        </el-icon>
        <div>后勤服务</div>
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
    <div class="about-content">
      <div class="about-content-left">
        <img :src="bg3" style="width:100%;height:100%" />
      </div>
      <div class="about-content-right">
        <div>
          昆明阿笨科技有限公司是一家专业从事企业管理软件开发与服务的公司，其业务涉及软件开发，GPS物流电子锁、车辆道闸系统、网络系统集成，公司经过多年的发展和经验积累，已经在智慧商业和智慧社区物业综合管理软件行业有很高的知名度、目前针对商铺租赁行业已经做到极致，完全图形化的租赁管理软件。公司以"诚信第一，服务到永远，每日有进步”为宗旨，以先进的管理理念为依据，集合各行业的地方管理特点及管理模式开发出具有个性特色又适合地方行业的企业管理系统.
        </div>
        <div>
          昆明阿笨科技有限公司凭借丰富的经验和以诚信为本的服务精神，紧紧围绕用户需求，自主开发了一系列软件产品，为用户提供优质快捷的服务，包括服务热线支持、用户客户化定制开发、现场技术支持、用户培训、项目实施、系统集成、技术支援、系统运行评估、专业人员培训等全方位的服务。公司不仅拥有优秀的开发团队，还拥有优秀的管理团队和资深的高级顾问，他们具备丰富的大中型软件系统的设计开发经验，精通企业管理软件及软件应用行业特点，为企业提供切合实际需求的完整的解决方案，使用户通过现代化的管理真正达到"以软件配合管理制度，向管理要效益”的目的.
        </div>
      </div>
    </div>
  </div>
  <div class="contact" id="contact-link">
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
import Footer from '../../components/footer/index.vue'

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
    margin: 40px 0;
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

  .major-content {
    width: 80%;
    height: auto;
    display: flex;
    flex-wrap: wrap;

    .major-item {
      width: 46%;
      margin: 2%;

      .box-card {
        text-align: center
      }
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
    margin: 40px 0;
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
    margin: 40px 0;
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

  .about-content {
    width: 80%;
    margin: 20px 10%;
    display: flex;
    align-items: center;
    justify-content: space-between;

    .about-content-left {
      width: 50%;
      height: 300px
    }

    .about-content-right {
      width: 50%;
      height: 300px;

      div{
        font-size: 14px;
        margin: 20px 0;
        text-indent: 28px;
      }
    }
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
    margin: 40px 0;
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
