package com.example.springbootdemo;

import com.example.springbootdemo.impl.MailServiceImpl;
import com.example.springbootdemo.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {
    @Autowired
    private com.example.springbootdemo.service.MailService MailService;
    @Test
    public void contextLoads() {

        MailService.sendHtmlEmail("714414089@qq.com","test email","\n" +
                "\n" +
                "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=7,9,10,11\" />\n" +
                "<meta name=\"renderer\" content=\"webkit\">\n" +
                "<script src=\"/sns/box-static/disk-share/js/share.dp.js?t=1562153877742\"></script>\n" +
                "<link rel=\"shortcut icon\" href=\"/res/static/images/favicon.ico\"/>\n" +
                "<script src=\"/sns/box-static/disk-share/js/mod.js?t=1562153877742\"></script>\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"/box-static/consult/base.css\"/>\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"/box-static/consult/system-core.css\"/>\n" +
                "<script src=\"/box-static/consult/base.js\"></script>\n" +
                "<script src=\"/box-static/consult/system-core.js\"></script>\n" +
                "\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"/box-static/consult/function.css\"/>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<meta content=\"b31ebb7c3759312418b3645de4991aef\" name=\"baidu-tc-verification\"/>\n" +
                "<meta content=\"max-age=30\" http-equiv=\"Cache-Control\"/>\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=0\">\n" +
                "<meta content=\"网盘,百度网盘,百度云,网络U盘,网络硬盘,免费网盘,网盘下载,网盘资源,同步,云存储,外链分享,离线下载\" name=\"keywords\"/>\n" +
                "<meta content=\"百度网盘为您提供文件的网络备份、同步和分享服务。空间大、速度快、安全稳固，支持教育网加速，支持手机端。注册使用百度网盘即可享受免费存储空间\" name=\"description\"/>\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"/box-static/consult/file-widget-1-icons.css\"/>\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"/box-static/consult/function-widget-1-icons.css\"/>\n" +
                "<script src=\"/box-static/consult/file-widget-1-manifest.js\"></script>\n" +
                "<script src=\"/box-static/consult/function-widget-1-manifest.js\"></script>\n" +
                "<script src=\"/box-static/consult/file-widget-1-map.js\"></script>\n" +
                "<script src=\"/box-static/consult/function-widget-1-map.js\"></script>\n" +
                "<style type=\"text/css\">.icon-shareSave-gray{background:url(/sns/box-static/disk-share/widget/plugin/shareFileSave/img/shareSave-gray-default_1e32df2.png?t=1562153877742?__sprite) center no-repeat}.g-button:hover .icon-shareSave-gray{background:url(/sns/box-static/disk-share/widget/plugin/shareFileSave/img/shareSave-gray-hover_43ad6aa.png?t=1562153877742?__sprite) center no-repeat}.icon-shareSave-white{background:url(/sns/box-static/disk-share/widget/plugin/shareFileSave/img/shareSave-white-default_3477e0e.png?t=1562153877742?__sprite) center no-repeat}.g-button:hover .icon-shareSave-white{background:url(/sns/box-static/disk-share/widget/plugin/shareFileSave/img/shareSave-white-hover_3477e0e.png?t=1562153877742?__sprite) center no-repeat}.icon-shareSave-blue{background:url(/sns/box-static/disk-share/widget/plugin/shareFileSave/img/shareSave-blue-default_005ff9d.png?t=1562153877742?__sprite) center no-repeat}.g-button:hover .icon-shareSave-blue{background:url(/sns/box-static/disk-share/widget/plugin/shareFileSave/img/shareSave-blue-hover_43ad6aa.png?t=1562153877742?__sprite) center no-repeat}.icon-unlinkShare-gray{background:url(/sns/box-static/disk-share/widget/plugin/unLinkShare/img/unlinkShare-gray-default_7d06e77.png?t=1562153877742?__sprite) center no-repeat}.g-button:hover .icon-unlinkShare-gray{background:url(/sns/box-static/disk-share/widget/plugin/unLinkShare/img/unlinkShare-gray-hover_3dff822.png?t=1562153877742?__sprite) center no-repeat}</style><script type=\"text/javascript\">[].push.apply(window.manifest||(window.manifest=[]),[{\"name\":\"\\u7f51\\u76d8\\u94fe\\u63a5\\u7ba1\\u7406-\\u8bc4\\u8bba\",\"group\":\"com.baidu.pan\",\"description\":\"The comment plugin.\",\"entranceFile\":\"disk-share:widget\\/plugin\\/comment\\/start.js\"},{\"name\":\"\\u7f51\\u76d8\\u94fe\\u63a5\\u7ba1\\u7406-\\u70b9\\u8d5e\",\"group\":\"com.baidu.pan\",\"description\":\"The likes plugin.\",\"entranceFile\":\"disk-share:widget\\/plugin\\/likes\\/start.js\"},{\"name\":\"\\u7f51\\u76d8\\u94fe\\u63a5\\u7ba1\\u7406-\\u4e3e\\u62a5\",\"group\":\"com.baidu.pan\",\"description\":\"The qrCode plugin.\",\"buttons\":[{\"position\":\"shareTools\",\"index\":4,\"title\":\"\\u4e3e\\u62a5\",\"buttonStyle\":\"normal\",\"name\":\"reportBad\",\"yunData\":\"yunData.MYUK !== yunData.SHARE_UK\",\"conditions\":{\"pageModule\":\"link\"}}],\"entranceFile\":\"disk-share:widget\\/plugin\\/reportBad\\/start.js\"},{\"name\":\"\\u4fdd\\u5b58\\u5230\\u7f51\\u76d8\",\"group\":\"com.baidu.pan\",\"description\":\"The tools of transferFiles plugin.\",\"buttons\":[{\"position\":\"shareTools\",\"index\":1,\"title\":\"\\u4fdd\\u5b58\\u5230\\u7f51\\u76d8\",\"buttonStyle\":\"normal\",\"icon\":\"icon-save-disk\",\"name\":\"shareSave\",\"color\":\"blue\",\"conditions\":{\"pageModule\":\"link\"},\"yunData\":\"yunData.MYUK !== yunData.SHARE_UK\"},{\"position\":\"shareListTools\",\"index\":1,\"title\":\"\\u4fdd\\u5b58\\u5230\\u6211\\u7684\\u767e\\u5ea6\\u7f51\\u76d8\",\"buttonStyle\":\"normal\",\"icon\":\"icon-save-disk\",\"name\":\"shareSave\",\"conditions\":{\"pageModule\":\"link\"},\"yunData\":\"yunData.MYUK !== yunData.SHARE_UK\"},{\"position\":\"shareList\",\"index\":1,\"title\":\"\\u4fdd\\u5b58\\u5230\\u6211\\u7684\\u767e\\u5ea6\\u7f51\\u76d8\",\"buttonStyle\":\"normal\",\"icon\":\"icon-save-disk\",\"name\":\"shareSave\",\"conditions\":{\"pageModule\":\"link\"},\"yunData\":\"yunData.MYUK !== yunData.SHARE_UK\"}],\"entranceFile\":\"disk-share:widget\\/plugin\\/shareFileSave\\/start.js\"},{\"name\":\"\\u7f51\\u76d8\\u94fe\\u63a5\\u7ba1\\u7406-\\u53d6\\u6d88\\u5206\\u4eab\\u94fe\\u63a5\",\"group\":\"com.baidu.pan\",\"description\":\"The unlinkShare plugin.\",\"buttons\":[{\"position\":\"shareTools\",\"index\":1,\"title\":\"\\u53d6\\u6d88\\u5206\\u4eab\",\"buttonStyle\":\"normal\",\"icon\":\"icon-share-cancel\",\"name\":\"unLinkShare\",\"conditions\":{\"pageModule\":\"link\"},\"yunData\":\"yunData.MYUK === yunData.SHARE_UK\"}],\"entranceFile\":\"disk-share:widget\\/plugin\\/unLinkShare\\/start.js\"}]);</script>\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"/sns/box-static/disk-share/css/layout/layout.css?t=1562153877742\"/><link rel=\"stylesheet\" type=\"text/css\" href=\"/sns/box-static/disk-share/css/page/share-single.css?t=1562153877742\"/><link rel=\"stylesheet\" type=\"text/css\" href=\"/sns/box-static/disk-share/pkg/system_5e0b154.css?t=1562153877742\"/><link rel=\"stylesheet\" type=\"text/css\" href=\"/sns/box-static/disk-share/pkg/page-ui_d9cd0d7.css?t=1562153877742\"/></head>\n" +
                "<body>\n" +
                "<script> alog('speed.set', 'ht', +new Date); </script>\n" +
                "\n" +
                "<div class=\"frame-all\" id=\"layoutApp\">\n" +
                "\n" +
                "<div class=\"frame-main\" id=\"layoutMain\">\n" +
                "<div class=\"frame-content\">\n" +
                "\n" +
                "<div node-type=\"module\" class=\"module-share-header\">\n" +
                "<div class=\"slide-show-header clearfix\">\n" +
                "<div class=\"slide-show-left\">\n" +
                "<h2 class=\"file-name\" title=\"文件名\">\n" +
                "<em class=\"global-icon-16\"></em>文件名</h2>\n" +
                "</div>\n" +
                "<div class=\"slide-show-right\">\n" +
                "<span class=\"slide-header-funcs\">\n" +
                "</span>\n" +
                "<div class=\"module-share-top-bar g-clearfix\">\n" +
                "<div class=\"bar\"></div>\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"cb\"></div>\n" +
                "<div class=\"slide-show-other-infos\">\n" +
                "<div class=\"share-file-info\">\n" +
                "<span>2019-07-22 15:04</span>\n" +
                "</div>\n" +
                "<div class=\"share-valid-check\">\n" +
                "失效时间：7天后\n" +
                "</div>\n" +
                "<div class=\"slide-show-other-cns clearfix\">\n" +
                "<span class=\"title-funcs\">\n" +
                "<span class=\"funcs-share-area\">\n" +
                "</span>\n" +
                "</span>\n" +
                "</div>\n" +
                "<div class=\"cb\"></div>\n" +
                "</div>\n" +
                "</div>\n" +
                "</div>\n" +
                "<div node-type=\"module\" class=\"module-share-file-main\">\n" +
                "<div class=\"share-file-viewer\">\n" +
                "\n" +
                "<div class=\"module-video global-clearfix\">\n" +
                "<div class=\"video-content\">\n" +
                "<div id=\"video-wrap-outer\" class=\"video-wrap-outer\">\n" +
                "<div id=\"video-wrap\" class=\"video-wrap\">\n" +
                "</div>\n" +
                "<div class=\"video-start-tip\">\n" +
                "为你播放片头，<a href=\"javascript:void(0);\" class=\"save-to-pan\">保存到网盘</a>\n" +
                "后就可以看完整视频啦<em class=\"close-btn\"></em>\n" +
                "</div>\n" +
                "<div class=\"video-over-tip\">\n" +
                "1秒钟<a href=\"javascript:void(0);\" class=\"save-to-pan\">保存至网盘</a>\n" +
                "即可观看完整视频</div>\n" +
                "<div class=\"video-overlay-iframe\"></div>\n" +
                "</div>\n" +
                "<div class=\"video-loading-tip\"></div>\n" +
                "</div>\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"ad-single-bottom ad-platform-tips\" node-id=\"web-sharesinglebanner\" id=\"web-single-bottom\">\n" +
                "</div>\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"module-aside aside\" id=\"layoutAside\">\n" +
                "\n" +
                "<div node-type=\"module\" class=\"module-share-person-info\">\n" +
                "<div class=\"share-person-inner global-clearfix haha\">\n" +
                "<div class=\"share-person-avatar\">\n" +
                "<a href=\"//yun.baidu.com/buy/center?tag=1&from=sicon\" class=\"vip-icon sicon\" target=\"_blank\"><em></em></a>\n" +
                "<a href=\"/share/home?uk=2690428978&suk=VpwQPhWQgxFew2E7VNBqrg\" target=\"_blank\" title=\"去Ta的分享主页\" class=\"person-icon\"><img alt=\"探长***ice\" src=\"https://ss0.bdstatic.com/7Ls0a8Sm1A5BphGlnYG/sys/portrait/item/fea0ed58.jpg\"></a>\n" +
                "</div>\n" +
                "<div class=\"share-person-data self\">\n" +
                "<div class=\"share-person-data-top\">\n" +
                "<a href=\"/share/home?uk=2690428978&suk=VpwQPhWQgxFew2E7VNBqrg\" target=\"_blank\" title=\"去Ta的分享主页\" class=\"share-person-username global-ellipsis\">探长***ice</a>\n" +
                "<a href=\"//yun.baidu.com/buy/center?tag=8&from=sicon\" class=\"svip-icon sicon\">\n" +
                "<em></em>\n" +
                "</a>\n" +
                "</div>\n" +
                "</div>\n" +
                "</div>\n" +
                "<ul class=\"share-person-numbers\" node-type=\"share-person-numbers\">\n" +
                "<li class=\"sharecnt\"><a href=\"/share/home?uk=2690428978&suk=VpwQPhWQgxFew2E7VNBqrg&view=share\"><em title=\"<%= data.pubshare_count %>\"><%= data.pubshare_count %></em><span>分享</span></a></li>\n" +
                "<li class=\"albumcnt\"><a href=\"/share/home?uk=2690428978&suk=VpwQPhWQgxFew2E7VNBqrg&view=album\"><em title=\"<%= data.album_count %>\"><%= data.album_count %></em><span>专辑</span></a></li>\n" +
                "<li class=\"followcnt\"><a href=\"/share/home?uk=2690428978&suk=VpwQPhWQgxFew2E7VNBqrg&view=follow\"><em title=\"<%= data.follow_count %>\"><%= data.follow_count %></em><span>订阅</span></a></li>\n" +
                "<li class=\"fanscnt\"><a href=\"/share/home?uk=2690428978&suk=VpwQPhWQgxFew2E7VNBqrg&view=fans\"><em title=\"<%= data.fans_count %>\"><%= data.fans_count %></em><span>粉丝</span></a></li>\n" +
                "</ul>\n" +
                "</div>\n" +
                "<div id='web-right-view' type='4' style=\"margin-top:10px\" node-id=\"web-sharelinkpic\" class=\"ad-platform-tips\">\n" +
                "</div>\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"/sns/box-static/disk-share/css/cover.css?t=1562153877742\"/>\n" +
                "<link rel=\"stylesheet\" node-type=\"theme-link\" type=\"text/css\" href=\"/box-static/disk-theme/theme/white/header-theme.css\"/>\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div id=\"ft\">\n" +
                "\n" +
                "<div class=\"module-share-footer\">\n" +
                "<div>&copy;2019Baidu<a target=\"_blank\" href=\"//pan.baidu.com/platform/home\">移动开放平台</a>|<a target=\"_blank\" href=\"/disk/duty/\">服务协议</a>|<a target=\"_blank\" href=\"//yun.baidu.com/disk/privacy\">权利声明</a>|<span class=\"versions\"><a href=\"//yun.baidu.com/disk/version\" target=\"_blank\">版本更新</a><b id=\"vers-update-new\">web版有更新</b></span>|<a target=\"_blank\" href=\"http://yun.baidu.com/disk/help\">帮助中心</a>|<a target=\"_blank\" href=\"http://qingting.baidu.com/index?pid=19\">问题反馈</a>|<a href=\"http://copyright.baidu.com/index.php/index/complaint\" target=\"_blank\">版权投诉</a></div>\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "\n" +
                "<script type=\"text/javascript\" src=\"/sns/box-static/disk-share/js/log.js?t=1562153877742\"></script>\n" +
                "\n" +
                "<script>\n" +
                "        void function(e,t){for(var n=t.getElementsByTagName(\"img\"),a=+new Date,i=[],o=function(){this.removeEventListener&&this.removeEventListener(\"load\",o,!1),i.push({img:this,time:+new Date})},s=0;s< n.length;s++)!function(){var e=n[s];e.addEventListener?!e.complete&&e.addEventListener(\"load\",o,!1):e.attachEvent&&e.attachEvent(\"onreadystatechange\",function(){\"complete\"==e.readyState&&o.call(e,o)})}();alog(\"speed.set\",{fsItems:i,fs:a})}(window,document);\n" +
                "    </script>\n" +
                "<img style=\"position:absolute;top:-10px;left:-10px;width:1px;height:1px;display:none;\" src=\"//pcs.baidu.com/rest/2.0/pcs/file?method=plantcookie&type=ett\" />\n" +
                "<img style=\"position:absolute;top:-10px;left:-10px;width:1px;height:1px;display:none;\" src=\"//pcs.baidu.com/rest/2.0/pcs/file?method=plantcookie&type=stoken&source=pcs\" />\n" +
                "<img style=\"position:absolute;top:-10px;left:-10px;width:1px;height:1px;display:none;\" src=\"//pcsdata.baidu.com/rest/2.0/pcs/file?method=plantcookie&type=stoken&source=pcsdata\" />\n" +
                "<script>\n" +
                "        void function(a,b,c,d,e,f){function g(b){a.attachEvent?a.attachEvent(\"onload\",b,!1):a.addEventListener&&a.addEventListener(\"load\",b)}function h(a,c,d){d=d||15;var e=new Date;e.setTime((new Date).getTime()+1e3*d),b.cookie=a+\"=\"+escape(c)+\";path=/;expires=\"+e.toGMTString()}function i(a){var c=b.cookie.match(new RegExp(\"(^| )\"+a+\"=([^;]*)(;|$)\"));return null!=c?unescape(c[2]):null}function j(){var a=i(\"PMS_JT\");if(a){h(\"PMS_JT\",\"\",-1);try{a=a.match(/{[\"']s[\"']:(\\d+),[\"']r[\"']:[\"']([\\s\\S]+)[\"']}/),a=a&&a[1]&&a[2]?{s:parseInt(a[1]),r:a[2]}:{}}catch(c){a={}}a.r&&b.referrer.replace(/#.*/,\"\")!=a.r||alog(\"speed.set\",\"wt\",a.s)}}if(a.alogObjectConfig){var k=a.alogObjectConfig.sample,l=a.alogObjectConfig.rand;d=\"https:\"===a.location.protocol||a.alogObjectConfig.https?\"https://fex.bdstatic.com\"+d:\"http://fex.bdstatic.com\"+d,k&&l&&l>k||(g(function(){alog(\"speed.set\",\"lt\",+new Date),e=b.createElement(c),e.async=!0,e.src=d+\"?v=\"+~(new Date/864e5)+~(new Date/864e5),f=b.getElementsByTagName(c)[0],f.parentNode.insertBefore(e,f)}),j())}}(window,document,\"script\",\"/hunter/alog/dp.min.js\");\n" +
                "    </script>\n" +
                "<script>\n" +
                "        /* eslint-disable */\n" +
                "        if (navigator.userAgent.indexOf('MSIE') < 0 || navigator.userAgent.indexOf('MSIE 11.0') > 0) {\n" +
                "            alog('speed.set', 'drt', +new Date); \n" +
                "        }\n" +
                "    </script>\n" +
                "</body><script type=\"text/javascript\">require.resourceMap({\"res\":{\"disk-share:widget/plugin/comment/commentPanel.css\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/comment/commentPanel_ed83fcd.css?t=1562153877742\",\"pkg\":\"disk-share:p7\"},\"disk-share:widget/plugin/likes/likes.css\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/likes/likes_d41d8cd.css?t=1562153877742\",\"pkg\":\"disk-share:p7\"},\"disk-share:widget/plugin/reportBad/reportBad.css\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/reportBad/reportBad_8521e46.css?t=1562153877742\",\"pkg\":\"disk-share:p7\"},\"disk-share:widget/plugin/shareFileSave/ShareFileTree/createFolder/createFolder.css\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/shareFileSave/ShareFileTree/createFolder/createFolder_8150199.css?t=1562153877742\",\"pkg\":\"disk-share:p7\"},\"disk-share:widget/plugin/shareFileSave/ShareFileTree/fileTree/fileTree.css\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/shareFileSave/ShareFileTree/fileTree/fileTree_2d6450e.css?t=1562153877742\",\"pkg\":\"disk-share:p7\"},\"disk-share:widget/plugin/shareFileSave/ShareFileTree/fileTreeDialog/fileTreeDialog.css\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/shareFileSave/ShareFileTree/fileTreeDialog/fileTreeDialog_5b69130.css?t=1562153877742\",\"pkg\":\"disk-share:p7\"},\"disk-share:widget/plugin/shareFileSave/icon.css\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/shareFileSave/icon_7990ed9.css?t=1562153877742\",\"pkg\":\"disk-share:p7\"},\"disk-share:widget/plugin/unLinkShare/icon.css\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/unLinkShare/icon_9589679.css?t=1562153877742\",\"pkg\":\"disk-share:p7\"},\"disk-share:widget/plugin/comment/context.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/comment/context_6e5b906.js?t=1562153877742\",\"pkg\":\"disk-share:p2\"},\"disk-share:widget/plugin/comment/commentPanel.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/comment/commentPanel_f1e2b3f.js?t=1562153877742\",\"pkg\":\"disk-share:p2\",\"deps\":[\"disk-share:widget/plugin/comment/context.js\",\"disk-share:widget/plugin/comment/commentPanel.css\"]},\"disk-share:widget/plugin/comment/start.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/comment/start_02e3e45.js?t=1562153877742\",\"pkg\":\"disk-share:p2\",\"deps\":[\"disk-share:widget/plugin/comment/context.js\",\"disk-share:widget/plugin/comment/commentPanel.js\"]},\"disk-share:widget/plugin/likes/context.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/likes/context_f102bf6.js?t=1562153877742\",\"pkg\":\"disk-share:p3\"},\"disk-share:widget/plugin/likes/likes.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/likes/likes_94aedae.js?t=1562153877742\",\"pkg\":\"disk-share:p3\",\"deps\":[\"disk-share:widget/plugin/likes/context.js\",\"disk-share:widget/plugin/likes/likes.css\"]},\"disk-share:widget/plugin/likes/start.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/likes/start_b693337.js?t=1562153877742\",\"pkg\":\"disk-share:p3\",\"deps\":[\"disk-share:widget/plugin/likes/context.js\",\"disk-share:widget/plugin/likes/likes.js\"]},\"disk-share:widget/plugin/reportBad/context.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/reportBad/context_1105fbb.js?t=1562153877742\",\"pkg\":\"disk-share:p4\"},\"disk-share:widget/plugin/reportBad/reportBad.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/reportBad/reportBad_d3592ee.js?t=1562153877742\",\"pkg\":\"disk-share:p4\",\"deps\":[\"disk-share:widget/plugin/reportBad/context.js\",\"disk-share:widget/plugin/reportBad/reportBad.css\"]},\"disk-share:widget/plugin/reportBad/start.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/reportBad/start_62e49cb.js?t=1562153877742\",\"pkg\":\"disk-share:p4\",\"deps\":[\"disk-share:widget/plugin/reportBad/context.js\",\"disk-share:widget/plugin/reportBad/reportBad.js\"]},\"disk-share:widget/plugin/shareFileSave/context.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/shareFileSave/context_60831c2.js?t=1562153877742\",\"pkg\":\"disk-share:p5\"},\"disk-share:widget/plugin/shareFileSave/ShareFileTree/fileManagerApi/fileManagerApi.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/shareFileSave/ShareFileTree/fileManagerApi/fileManagerApi_4176785.js?t=1562153877742\",\"pkg\":\"disk-share:p5\",\"deps\":[\"disk-share:widget/plugin/shareFileSave/context.js\"]},\"disk-share:widget/plugin/shareFileSave/ShareFileTree/createFolder/createFolder.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/shareFileSave/ShareFileTree/createFolder/createFolder_e7ebe0a.js?t=1562153877742\",\"pkg\":\"disk-share:p5\",\"deps\":[\"disk-share:widget/plugin/shareFileSave/context.js\",\"disk-share:widget/plugin/shareFileSave/ShareFileTree/fileManagerApi/fileManagerApi.js\",\"disk-share:widget/plugin/shareFileSave/ShareFileTree/createFolder/createFolder.css\"]},\"disk-share:widget/plugin/shareFileSave/ShareFileTree/fileTree/fileTree.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/shareFileSave/ShareFileTree/fileTree/fileTree_ccfc7eb.js?t=1562153877742\",\"pkg\":\"disk-share:p5\",\"deps\":[\"disk-share:widget/plugin/shareFileSave/context.js\",\"disk-share:widget/plugin/shareFileSave/ShareFileTree/fileTree/fileTree.css\"]},\"disk-share:widget/plugin/shareFileSave/ShareFileTree/fileTreeDialog/fileTreeDialog.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/shareFileSave/ShareFileTree/fileTreeDialog/fileTreeDialog_b9cc407.js?t=1562153877742\",\"pkg\":\"disk-share:p5\",\"deps\":[\"disk-share:widget/plugin/shareFileSave/context.js\",\"disk-share:widget/plugin/shareFileSave/ShareFileTree/fileTree/fileTree.js\",\"disk-share:widget/plugin/shareFileSave/ShareFileTree/createFolder/createFolder.js\",\"disk-share:widget/plugin/shareFileSave/ShareFileTree/fileTreeDialog/fileTreeDialog.css\"]},\"disk-share:widget/plugin/shareFileSave/util/transferFilesService.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/shareFileSave/util/transferFilesService_dccd27b.js?t=1562153877742\",\"pkg\":\"disk-share:p5\",\"deps\":[\"disk-share:widget/plugin/shareFileSave/ShareFileTree/fileTreeDialog/fileTreeDialog.js\",\"disk-share:widget/plugin/shareFileSave/context.js\"]},\"disk-share:widget/plugin/shareFileSave/util/transferFiles.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/shareFileSave/util/transferFiles_a8f9852.js?t=1562153877742\",\"pkg\":\"disk-share:p5\",\"deps\":[\"disk-share:widget/plugin/shareFileSave/util/transferFilesService.js\",\"disk-share:widget/plugin/shareFileSave/context.js\"]},\"disk-share:widget/plugin/shareFileSave/start.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/shareFileSave/start_192e022.js?t=1562153877742\",\"pkg\":\"disk-share:p5\",\"deps\":[\"disk-share:widget/plugin/shareFileSave/util/transferFiles.js\",\"disk-share:widget/plugin/shareFileSave/context.js\"]},\"disk-share:widget/plugin/unLinkShare/context.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/unLinkShare/context_0d7e4ba.js?t=1562153877742\",\"pkg\":\"disk-share:p6\"},\"disk-share:widget/plugin/unLinkShare/unLinkShare.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/unLinkShare/unLinkShare_9147098.js?t=1562153877742\",\"pkg\":\"disk-share:p6\",\"deps\":[\"disk-share:widget/plugin/unLinkShare/context.js\"]},\"disk-share:widget/plugin/unLinkShare/start.js\":{\"url\":\"/sns/box-static/disk-share/widget/plugin/unLinkShare/start_cdf1d14.js?t=1562153877742\",\"pkg\":\"disk-share:p6\",\"deps\":[\"disk-share:widget/plugin/unLinkShare/context.js\",\"disk-share:widget/plugin/unLinkShare/unLinkShare.js\"]},\"disk-share:static/js/pcsDownloadUtil.js\":{\"url\":\"/sns/box-static/disk-share/js/pcsDownloadUtil.js?t=1562153877742\"},\"disk-share:static/js/baidu-tongji.js\":{\"url\":\"/sns/box-static/disk-share/js/baidu-tongji.js?t=1562153877742\"}},\"pkg\":{\"disk-share:p7\":{\"url\":\"/sns/box-static/disk-share/pkg/plugin_c397a51.css?t=1562153877742\"},\"disk-share:p2\":{\"url\":\"/sns/box-static/disk-share/pkg/plugin-comment_b78b9bb.js?t=1562153877742\"},\"disk-share:p3\":{\"url\":\"/sns/box-static/disk-share/pkg/plugin-likes_b05fb9f.js?t=1562153877742\"},\"disk-share:p4\":{\"url\":\"/sns/box-static/disk-share/pkg/plugin-reportBad_13a2497.js?t=1562153877742\"},\"disk-share:p5\":{\"url\":\"/sns/box-static/disk-share/pkg/plugin-shareFileSave_7442489.js?t=1562153877742\"},\"disk-share:p6\":{\"url\":\"/sns/box-static/disk-share/pkg/plugin-unLinkShare_738aade.js?t=1562153877742\"}}});</script><script type=\"text/javascript\" src=\"/sns/box-static/disk-share/widget/data/yunData_861dc4f.js?t=1562153877742\"></script>\n" +
                "<script type=\"text/javascript\" src=\"/sns/box-static/disk-share/pkg/system_2c295f1.js?t=1562153877742\"></script>\n" +
                "<script type=\"text/javascript\" src=\"/sns/box-static/disk-share/pkg/page-ui_f018855.js?t=1562153877742\"></script>\n" +
                "<script type=\"text/javascript\" src=\"/sns/box-static/disk-share/js/boot.js?t=1562153877742\"></script>\n" +
                "<script type=\"text/javascript\">!function(){                (function(){\n" +
                "            var context = require('system-core:context/context.js');\n" +
                "            var Broker = require('system-core:pluginHub/Broker/Broker.js');\n" +
                "            var yunData = require('disk-share:widget/data/yunData.js');\n" +
                "            yunData.setData({\"loginstate\":1,\"username\":\"\\u5c0f\\u72d7\\u7b80\\u81ea\\u8c6a\",\"third\":0,\"flag\":2,\"file_list\":{\"errno\":0,\"list\":[{\"app_id\":\"250528\",\"category\":1,\"delete_fs_id\":\"0\",\"extent_int3\":\"2690428978\",\"extent_tinyint1\":\"0\",\"extent_tinyint2\":\"0\",\"extent_tinyint3\":\"0\",\"extent_tinyint4\":\"0\",\"file_key\":\"\",\"fs_id\":57180739950507,\"isdelete\":\"0\",\"isdir\":0,\"local_ctime\":1563776974,\"local_mtime\":1563763916,\"md5\":\"\",\"oper_id\":\"2690428978\",\"parent_path\":\"\",\"path\":\".mp4\",\"path_md5\":\"\",\"root_ns\":1491968254,\"server_ctime\":1563779033,\"server_filename\":\".mp4\",\"server_mtime\":1563779033,\"share\":\"0\",\"size\":620075524,\"status\":\"0\",\"thumbs\":{\"url1\":\"https:\\/\\/thumbnail0.baidupcs.com\\/thumbnail\\/3a5ccd25c2b139b2aaaeb7a90c758ebf?fid=2690428978-250528-57180739950507&time=1563778800&rt=sh&sign=FDTAER-DCb740ccc5511e5e8fedcff06b081203-Q79fdXoOZRzDAOhuxXRiwqbuR7c%3D&expires=8h&chkv=0&chkbd=0&chkpc=&dp-logid=4699645224295521239&dp-callid=0&size=c140_u90&quality=100&vuk=-&ft=video\",\"url2\":\"https:\\/\\/thumbnail0.baidupcs.com\\/thumbnail\\/3a5ccd25c2b139b2aaaeb7a90c758ebf?fid=2690428978-250528-57180739950507&time=1563778800&rt=sh&sign=FDTAER-DCb740ccc5511e5e8fedcff06b081203-Q79fdXoOZRzDAOhuxXRiwqbuR7c%3D&expires=8h&chkv=0&chkbd=0&chkpc=&dp-logid=4699645224295521239&dp-callid=0&size=c360_u270&quality=100&vuk=-&ft=video\",\"url3\":\"https:\\/\\/thumbnail0.baidupcs.com\\/thumbnail\\/3a5ccd25c2b139b2aaaeb7a90c758ebf?fid=2690428978-250528-57180739950507&time=1563778800&rt=sh&sign=FDTAER-DCb740ccc5511e5e8fedcff06b081203-Q79fdXoOZRzDAOhuxXRiwqbuR7c%3D&expires=8h&chkv=0&chkbd=0&chkpc=&dp-logid=4699645224295521239&dp-callid=0&size=c850_u580&quality=100&vuk=-&ft=video\",\"icon\":\"https:\\/\\/thumbnail0.baidupcs.com\\/thumbnail\\/3a5ccd25c2b139b2aaaeb7a90c758ebf?fid=2690428978-250528-57180739950507&time=1563778800&rt=sh&sign=FDTAER-DCb740ccc5511e5e8fedcff06b081203-Q79fdXoOZRzDAOhuxXRiwqbuR7c%3D&expires=8h&chkv=0&chkbd=0&chkpc=&dp-logid=4699645224295521239&dp-callid=0&size=c60_u60&quality=100&vuk=-&ft=video\"},\"server_filename_suffix\":\".mp4\"}]},\"uk\":2690428978,\"task_key\":null,\"task_time\":null,\"sampling\":{\"expvar\":[\"sampling_test\",\"disk_h5_pdf\",\"video_high_speed\",\"disk_timeline\"]},\"bdstoken\":\"dddab6c93a0fcd664c0eb0d2cbadfd3e\",\"is_vip\":0,\"bt_paths\":null,\"applystatus\":null,\"sign1\":null,\"sign2\":null,\"sign3\":null,\"timestamp\":1563779542,\"timeline_status\":null,\"face_status\":null,\"srv_ts\":null,\"need_tips\":null,\"is_year_vip\":0,\"show_vip_ad\":0,\"vip_end_time\":null,\"is_evip\":0,\"is_svip\":0,\"is_auto_svip\":0,\"photo\":\"https:\\/\\/ss0.bdstatic.com\\/7Ls0a8Sm1A5BphGlnYG\\/sys\\/portrait\\/item\\/fea0ed58.jpg\",\"linkusername\":\"\\u63a2\\u957f***ice\",\"shareid\":3648827947,\"sign\":\"4f16244686f22d314268707fdd710efb38d3ef68\",\"public\":0,\"ctime\":1563779053,\"description\":\"\",\"self\":false,\"visitor_avatar\":\"https:\\/\\/ss0.bdstatic.com\\/7Ls0a8Sm1A5BphGlnYG\\/sys\\/portrait\\/item\\/34ae6e78.jpg\",\"novelid\":false,\"visitor_uk\":2927393457,\"share_page_type\":\"single\",\"is_master_vip\":1,\"is_master_svip\":1,\"errortype\":null,\"curr_activity_code\":0,\"activity_end_time\":0,\"expiredType\":604310,\"pansuk\":\"dvHNPXlKDV5D8iNPpJ5ydA\",\"sharesuk\":\"VpwQPhWQgxFew2E7VNBqrg\",\"unlogin_user_in_small_flow\":null,\"title_img\":[\"iVBORw0KGgoAAAANSUhEUgAAARsAAAAeCAIAAACT9S1xAAANAElEQVR42uxbe1CU1fs\\/717eXbmsLMhlBeQihIlXlHCTBgi5RIIkDI5mXAIzAgRsGi8gAQMYOCpCjJGUFiIaQ+hkkEAG2ASxw0UkwQAVgQWRS7LALnt7f\\/P1fDttixIi9vvV73z+Os95znneZ897Puc8z\\/MCg6IogIGBMU+g4SXAwMCMwsDAjMLAwIzCwMDAjMLAwIzCwMCMwsDAeL6Mkkql\\/3\\/Wbnx8vLm5WaFQzGZwQkJCc3Mz3nD\\/ejBUhZKSkqKior6+PjabbW9vn5KS8lS2EhMTs7Ky+vr6FixYMDdvoqKiZDIZAIAkSTs7uzfffJPJZD6Pny2TyaKjo729vV977TXUmZaWpq2tHRUVhXoyMjIWLly4e\\/fuxxqpq6tzc3MbHR3V0dH5yydKJJLg4OCmpiaCINRU77777o8\\/\\/jjD3P379+\\/cuRNv1n8Yoz744IPs7Oy33nrL29t7eHi4oqLiaRnl6enJZDLZbPacvTl16pS9vb2NjU1PT8\\/JkycLCwuvXLkyZ2tjY2MHDx6MioqysbFRUzGZzLq6ut7eXsSohw8fJiYmcjiciIgIGu0\\/V\\/fU1FRiYmJycvLcnh4SEnLnzh1VRg0MDLi4uKAekiTLy8sBAHfv3g0ICPDx8YH9gYGBISEhaOT+\\/fuHhobwTv2HMWpsbOz4I6ATWqlUPq2tDY\\/wjA4FBQWFhYUBAE6cOBETE\\/Prr7++8MILczM1ODiYk5MTHBz8WK2Xl1d2drZcLmcw\\/rMIFRUVHA5neHi4sbFx\\/fr1AIDa2lqxWOzp6Tm3pwsEAj8\\/Pz6f\\/6QBdDodtZcsWbJmzRrY1tDQsLCwQOJsLkCM\\/3OMkslkCoVCLpf\\/kWDR\\/pti5ebm6ujoWFhYZGVl\\/fbbb05OTtHR0SRJAgAyMzMtLS2lUmlRUVFCQsLg4GB1dXViYiKaxePxTp48OTExsf0R0GmdlZVVU1PD4XD27t1bWlq6ceNGV1dXNc9MTU0JgtDS0oLi6OhoTk5OfX09QRCOjo4REREaGhozqKqrq8+cOQMAOHbsmIGBQWpqqqamphqjUlNT6+vrX375ZQDAd9995+npWVNTU15eDhl19epVExOTFStWAADEYjH0WUtLa9euXZs2bUJ2JicnT5w4UV9fb2RktHfvXltbW6Rau3YtIuSFCxcMDAzgzSMUCjs6OpycnNDImzdvVlZWotOtpaUF\\/fD79+9Pf2379u3bunVrQ0NDWVmZsbFxUlISRVFpaWmdnZ12dnbx8fEwUkhPT1+9ejWDwTh16pREIvHy8nrnnXemh50Y888oPT09X1\\/fuLg4pVIZGRnJYrFUk6uhoSE6nR4YGDg6OpqSknLjxo0vv\\/wSAHD+\\/Hk2mz05Oeno6CiXyxsaGvLy8iCjSkpKhEKhoaFhQEBAVVXVjh07DAwMXF1dKYp64403WlpaYmJiGAxGUFBQT08PSZKIUePj44ODgzdv3jx06FBsbOzixYsBAENDQ3w+n8PhBAcHy+Xy7Ozsr7\\/+uqamhslkPklFo9HgJUCn0xkMxvRttGHDBj09vfLycsSojz76iM1mV1ZWHjx4EABQWVnp5uYGjxsPDw+RSBQZGdnd3b158+bi4uLXX38d2tm5c+e6det8fX3Pnj3L5\\/MbGhqsra3RU1auXFlQULBq1SqBQDA0NAQZ9dVXX505c0a1UFFWVtbS0gLbQqHw4sWLP\\/30ExTb29u3bNmi5nxOTk5paamHh4e7u3tGRkZra6tEIvHz8+PxeCkpKWKx+OjRowCA\\/Pz8S5cuMZnMHTt2dHd3R0dHd3d3p6Wl4X3\\/HEH9DrFYHBsby2AwTExMPvvsM9Tv4eFhZGT08OFDKBYUFBAEce\\/ePYqiHBwcTExMJicnoerIkSPGxsZolqWl5dTUFEVRSqXS2tr6vffeoyiqrKyMIIimpiY4rK2tjSCIw4cPQ1GVycuXL6+urob9sbGx5ubmExMTULx9+zaDwTh37tzMqo6ODhh9UU\\/A9u3b+Xw+RVHXr18nCGJwcLCoqIgkyfHxcZFIxGAwCgsLKYrKy8vjcrkPHjyAs3bv3u3s7ExRVEVFBdzcsF8ikSxZsmTPnj1QtLW1vXjxore3d0JCAkVRxcXFZmZmUOXl5XXgwAHkxqZNm06fPo1EBweHkpISJG7btu348eNqnmtqagYFBcF2YWEhDJKhGBkZaWNjg3ywtbWVSqVQTE9PX7BgAXpfGM8Df1TP2Wz2sWPH2tvbnZ2dw8LCQkJCkMrV1ZXD4cC2u7s7RVHofPX09HxSZe+VV16BwSFBELa2tg8ePIChlI2NDUoSli1bZmxsrDorIyOjp6enra3N39\\/fxcUFViaqqqp8fHxQmGdhYbF27VpYH5tBpZbVbP4d8fHxKPATCARjY2OlpaV2dnb6+vpubm5KpbK6urqmpkapVLq7uwMAvv\\/+ey6Xm5mZGf8Id+7caW1tRZa3bt0KGywWy8XFBa3M1NQUi8Xy8vK6dOkSAIDP53d3dwuFQolE8sMPP6A6BBw5h3KOo6MjbMA8E1UyrKysRkZG0LDNmzejeqm7u7tYLG5vb8cXyd9UPQcALF26ND8\\/n8\\/nR0REhIaGwtc2\\/X2j\\/6pauHDhE00zGKpZOCx1jI2NqaXaavEYl8s1MTEBACQlJZWWlubn58OIC1EaQktLC377mkGllpWhEoWhoSE6DpRKZVVVFUyi4M9xcHCorKyk0Wj29va6urrQZxqNNj4+Dme9+OKL6ESYvjhoZUZGRnR1dZctWxYeHt7f38\\/j8RYtWiQQCFgsFofDcXBwQFNEIlFGRgbM+mCYl5yc\\/Mknn0Dx+vXrj633oOWFGS+iDVrqx7qn6iHG38EoCH9\\/\\/4iIiHv37kFxYGAAqerr6wEAMF+fA4yMjIqLi1GFbWRkpL+\\/\\/0mDJyYm4EaxsrJqampC\\/XK5\\/JdffvH29p5ZpbqBjIyM\\/P391ewvWrTI3t4eJi3oU4Gnp+eFCxfYbDbKlMzMzHp7ezMzMx\\/r5MDAADojBAKBs7MzLJaMjIxYWFjo6+ubmZmVl5cHBQWtWrWqq6uro6PDx8dH9RwRCoXJyclLly6F4p49e3x9fWF2BwBITU19lhes9u6YTOaca6cYT5FHdXd3h4WF\\/fzzzyKRqLe3Nzw8nMViwWTJw8ODTqcXFBQolcqurq7ly5e7ubmhiP\\/9999HEaRaHhUaGopUfo9AUVRLSwudTo+JiZmamhodHfXz8yNJUjWPio+PFwgEVVVVb7\\/9No1Gg6nUN998QxBETk6OTCabnJyMiYkxMDAYGhqaWTU4OAirjlKpVC6XPzbqTUpK0tbW1tHRQQMEAgGDwSBJsra2FvbU1dXRaLTDhw\\/LZDKlUllbW1tTU4PyKHd39+HhYalUmpSURKfTm5ubKYoqLS01MTGB0+Pi4r744guKoiYmJuRyuaGhYXl5OXJgYGCAIAiUps6QR129ehUlVJqamij1ggdKW1sbFLOzs\\/X09FAepaGhceXKFRioL168OCQkhKKo8fHxuLi427dvq5ptb28\\/dOiQRCLBudCz4L+MGh4eXr16NaKZtbX1t99+i7jh7+\\/v6OgIywaurq7379+fM6Moivr888+1tbVJkuRwOLm5uaampkePHlWrTJAk+dJLL12+fBlZ+PTTT3V1dUmSpNPpdnZ2jY2Ns1Ft27YNWhseHn7s729oaAAAIN9gHUVfX5\\/L5SoUCtR5+vRpLpfLZrM1NTVNTU2vXbuGGJWRkaGhocFkMrlc7tmzZ+H4wMDA8PDw6Y+rqKjg8Xiq9P7444\\/XrVunOkaNUQEBAXDHBwUFcTgc6NXsGRUaGrpy5UoWi0Wj0fz9\\/UUiEUVRjY2NBEHk5eWpmj1+\\/DiNRrt16xZmxTwwCmJ0dPTWrVsDAwOqnYgbd+\\/eVVPNGRKJpKOjY3JyUiqVslis8+fPz2aWXC7v6urq7+9\\/KtV8uS2TyTo7O3t6eqarxsbGOjs7UUmtqamJJMkbN244OTnR\\/wwajUYQBBK7urrMzMyys7OnM6qhoSE9Pf3IkSOGhoYFBQUURU1NTcG7d\\/awtbX98MMPYXChdqb09fXBBjKrVCqFQiGmxDPiT3mUziM8KT40MzN79iBToVCIxWItLS0rKyv4jZggiFdffXU2c+l0uqWl5dOq5sVtWAlAqY4atB8BiTweLzk5ecWKFZcvX1b9aD4dLBbL2dl5165dqp1btmwxNzcHAMA\\/ww0NDYXlRJIk9fT05uA5QRDTFwd+6FM1SxAEj8fDedBzqUw8P4hEInNzc\\/iNq7W19dq1a7m5ufr6+v+mNTU0NNy3bx+sOv7lYFTiQzhw4ABsnDt3Dm\\/Qfxzo8E8cZr4Z1qxZM18FIjabvXHjRolEolAo1q9fn5WVNcsLCmNu96q9vf183dIYs4oI8NcJDIx5BP4fXgwMzCgMDMwoDAzMKAwMDMwoDIz\\/PfxPAAAA\\/\\/\\/XaX4ptHPupwAAAABJRU5ErkJggg==\"],\"urlparam\":[],\"XDUSS\":\"pansec_DCb740ccc5511e5e8fedcff06b081203-nCc61K2JOvwTPC8s%2Bk0h4GdrsaCzpwrSt39DA0UifMXkCucjyLEkdIU8holwZwxn3JB1LFYV4folWEfNObBQKtbq2rjLdd%2FH4MnGlNpzJ9VFTxKF0rPRVGgOD5v%2BNAUKKdK7VH14eEFRahsrylV5Y2WicIg7ZzrWPLEv8Dm06FZw7%2BigQ0Id97sa2Oxnvc8PyB44ibHxh2RF7Cv%2BZDTn7pdG23lpbBSgqIVL%2BR5G%2Fwwvz4r%2FfNwidAxAgR%2Bh2s93vhWcw60RYxHxg3mHxpND7Q%3D%3D\"});\n" +
                "\n" +
                "            yunData.setData('SERVERTIME', 1563779543152);\n" +
                "            context.extend({data: {user: yunData.get()},Broker:Broker});\n" +
                "        })();\n" +
                "            }();\n" +
                "!function(){    var context = require('system-core:context/context.js').instanceForSystem;\n" +
                "    context.pluginControl.init();\n" +
                "    window.context = context;\n" +
                "    require(\"disk-share:widget/system/util/contextExtend.js\");\n" +
                "    context.message.callPlugin('IE浏览器升级提示@com.baidu.pan', {});\n" +
                "}();\n" +
                "!function(){    require(\"disk-share:widget/pageModule/share-top-bar/share-top-bar.js\");\n" +
                "}();\n" +
                "!function(){require(\"disk-share:widget/pageModule/share-header/share-header.js\");\n" +
                "require(\"disk-share:widget/pageModule/share-header/service/btns.js\");\n" +
                "}();\n" +
                "!function(){    require(\"disk-share:widget/pageModule/share-file-main/fileType/video/video.js\");\n" +
                "}();\n" +
                "!function(){        require(\"disk-share:widget/pageModule/share-file-main/adPanLog.js\");\n" +
                "    }();\n" +
                "!function(){    require(\"disk-share:widget/pageModule/share-person-info/share-person-info.js\");\n" +
                "}();\n" +
                "!function(){require(\"disk-share:widget/pageModule/share-footer/share-footer.js\");\n" +
                "}();\n" +
                "!function(){        require(\"disk-share:widget/pageModule/page-controller/index.js\");\n" +
                "        require(\"disk-share:widget/pageModule/page-controller/share-single.js\");\n" +
                "        require('disk-share:widget/pageModule/activateGuide/activateGuide.js');\n" +
                "        require('disk-share:widget/pageModule/adPlatform/adPlatform.js').getAdResoucre(\n" +
                "            {\n" +
                "                list: [\n" +
                "                {\n" +
                "                    'id': 'web-sharelinkpic',\n" +
                "                    'w': 200,\n" +
                "                    'h': 200\n" +
                "                },\n" +
                "                {    \n" +
                "                    'id': 'web-sharesinglebanner',\n" +
                "                    'w': 710,\n" +
                "                    'h': 90\n" +
                "                }],\n" +
                "                uk: (window.yunData ? window.yunData.MYUK : '')\n" +
                "            }\n" +
                "        );\n" +
                "    }();\n" +
                "!function(){        require.async(\"disk-share:static/js/baidu-tongji.js\");\n" +
                "    }();</script></html>\n" +
                "\n");

    }

}
