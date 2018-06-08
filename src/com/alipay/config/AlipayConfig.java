package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016091200490709";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCVjki7wd/sPAh8HCxMMlfoHTcu+BW3rNqnZzJuFwQdS9hv9VLbaZiTTWRRor1qwitCEC+TyFfHr1Xu/1PjOoCm3+2CgSAVsZyZoEhltwMn2GxdzlVDVNCk+DJ2ULXMV33FiPeUzZGrqLzM5XUS9O0gxB5Ni9lt+J8eojx78ZSxQETn3maO1rJ66tMJApUKGv+2PQnAd7J8gfJXatMBYII5fjBJ2MDK628Juky3/9tGIGKDDKgazpY72FIJZGjZCCmhhBrbzRRDvhvdBqJ64Rf7UsT1q9o8jqm+5yPrnlR4O+d+X894cwIaC5ZIndER8N0Zoicuke90vjMVibdaBXn9AgMBAAECggEAXxBUV1TDO2xlkE5wMfcGPbrkauyzEU/EpQhJ3ASxTtX5PCFai7GxlGBrViD1+jh2OsYDGBMPCRUAsKyH7DYxtOE+HehqNp/xhQ2HN3B/hwJgz7fqJqRxA4vot6BSDxPGFJwdk+6fm9fkOvHX2zbozB0djflJOkgBDP3fKIHFHG1e4KIyHNrhtl0UxrH0tG5CRbnSbQPPeQbufrrH9JTpvjEPHU28VURuUXQ2TnDTh+6zU9g5efOjzn29nV4HbfVAf/mH43r1Zv+Ly9vCvQXV2JxINjEs0tYq2Bl2JsumGCnBeHC6aNBCbb/W+Kb9SPiK0VEooeuRo3SDulm/NDpyAQKBgQDMen1RwuGn4PYPM6dKod2VcacLIAJCAsiI6uvzxG++F3eSNVGY4bqqNzniJDLTAkAPbi+RI75i3FQDbG+J21sdtnB00H7nd4IKrNwyxi/IJOlZcK3xBzztDkKPDDF8piHNrSnEGXqzUcxrMmziqrTMytIF/XSBH+QRKk6qSnhIwQKBgQC7PRuMiYIiLeerJKBOSeN7FNxxc8sdI+8GsiNp7bj3C8AcYC7y5UPe8+RNmsAaULfuFi51FchmlklMqhXEmmnKMXCjye075A9pIXgPUYdlTnDKDjg8V26JKpaB3raqvXePfF5A/1uL3cDqT/tIit2yt1UAz9ikuSE54VC/IGEkPQKBgQC4hpltHVcSbtreoRiJK0WRxXyfd4VSGLzrgkToOQ82FmtbUC6QrrQLQ8dCorQS4+b3hdH7Qqxe/sH6TPLjD0dMqwUVBcpgC+MYyyHz2BHqphTHF/6Akq2Sp9m8yZ4nBK1gtLIKO4wVIu48lsbYToDWhvm9Whq3JBZmvy06U/X0gQKBgQCPqTc2AVujte0G1zdYWkD78umg8uNpHGUNkiix4gAFLTLdkr7zBw2oRyFomc/DYSN+ve4vT+NPMwhSlj3Vd1SsGnr+cLRhO37HfzKLLlbgV+saXQaw5bSd8dtBEgy9vFm78gSvgj5PdnnKTkvTQRkRQrEpyk/DM3hW3JYDz2g5UQKBgEQrPEvA4kYehKRdVP6gkZrEDCe/LXYtZrD0X8Ihj0VqXMHuIGUOc2h/sf3p0dEQjusIjwhRmn4oFAHAX/8cInYn3UQdLZKj4yd+hMKkosEUC1g7CsEnKPliecvr4nQUJslMv13R+a4O/hEjmhX845QXq9NNoM1UuZCHhiNnb09c";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA7BgLOzswOwh7Ivh8mDp+VjFTOakW2XVu70K00i2Te57o1ehu53Zng7FqwoOuIOrFDqNWpif2tGk77NkNOsIRlVF0zWD95pfakeFjAI9ZZTJ/mtDUppDjYMBDegSEbIujHXqMuElTYXTlQrPEgukTGFYTVjs9MmQUCV/ygJmN0oYqLZqrViexmXi9TTCDyHQJuZ56kcGK8B2Rs63XvHJgsMfK7XQTI5WGS0rMJrLYHMBbSpYGhQqblcwQcf3e8OZ4YGn7hmouW1QJCG+F8WIZXYpEPsyXwC55QZC1MhHja1vvGHcOTfcdcrQZybZUr4fJOy/8FglLu4djtFKKe7ac2QIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://pay2.java1234.com/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://pay2.java1234.com/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

