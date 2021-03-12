package com.maple.smaple;

import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.IndicesClient;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

/**
 * @author han yu
 * @version 1.0
 * @date 2021/3/11
 */
@SpringBootTest
public class ElasticSearchTest {

    @Autowired
    RestHighLevelClient restHighLevelClient;

    /**
     * 创建索引
     * @throws IOException
     */
    @Test
    void createIndex() throws IOException {
        CreateIndexRequest createIndexRequest = new CreateIndexRequest("index2");
        restHighLevelClient.indices().create(createIndexRequest,RequestOptions.DEFAULT);
    }


    }
