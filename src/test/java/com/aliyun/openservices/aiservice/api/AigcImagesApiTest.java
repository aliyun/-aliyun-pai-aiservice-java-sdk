/*
 * AI model Service Restful API
 * This is an ai model service
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.aliyun.openservices.aiservice.api;

import com.aliyun.openservices.aiservice.ApiClient;
import com.aliyun.openservices.aiservice.model.AIGCCreatRequest;
import com.aliyun.openservices.aiservice.model.AIGCImageCreateResponse;
import com.aliyun.openservices.aiservice.model.AIGCTrainRequest;
import com.aliyun.openservices.aiservice.model.AIGCImageTrainResponse;
import com.aliyun.openservices.aiservice.model.Response;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.util.Arrays;
import java.util.List;


/**
 * API tests for AigcImagesApi
 */
@Ignore
public class AigcImagesApiTest {

    private  AigcImagesApi api ;

    @Before
    public void createApi() {
        String host  = Constants.host;
        String appId = Constants.appId;
        String token = Constants.token;
        ApiClient apiClient = new ApiClient(host, appId, token);
        api = new AigcImagesApi(apiClient);
    }
    /**
     * aigc图像检测
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void aigcImagesCheckTest() throws Exception {
        List<String> images =Arrays.asList("https://pai-aigc-photog-bj.oss-cn-beijing.aliyuncs.com/photog/user_images/foto/train/1.jpg",
                "https://pai-aigc-photog-bj.oss-cn-beijing.aliyuncs.com/photog/user_images/foto/train/0.jpg",
                "http://47.95.234.175/assets/8db2c2ada33a403351447a990aaa2cda.jpg");

        Response response = api.aigcImagesCheck(images);

        System.out.println(response.getData());
    }
    /**
     * aigc预测
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void aigcImagesCreateTest() throws Exception {
        String modelId = "2ee7d8c6-199c-4e8b-95ca-170ffe096cf4";
        String templateImage = "https://pai-aigc-photog-bj.oss-cn-beijing.aliyuncs.com/photog/user_weights/foto10/validation/global_step_Blue_1_100_0.jpg";
        AIGCImageCreateResponse response = api.aigcImagesCreate(modelId, templateImage);

        System.out.println(response);
        System.out.println(response.getData().getImage());
    }
    /**
     * aigc图像
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void aigcImagesTrainTest() throws Exception {
        List<String> images = Arrays.asList("https://pai-aigc-photog-bj.oss-cn-beijing.aliyuncs.com/photog/user_images/foto/train/1.jpg",
                "https://pai-aigc-photog-bj.oss-cn-beijing.aliyuncs.com/photog/user_images/foto/train/0.jpg");

        AIGCImageTrainResponse response = api.aigcImagesTrain(images);
        int jobId = response.getData().getJobId();

        System.out.println("jobId:" + jobId);
        System.out.println("modelId:" + response.getData().getModelId());
        System.out.println(response.getData());
    }
}
