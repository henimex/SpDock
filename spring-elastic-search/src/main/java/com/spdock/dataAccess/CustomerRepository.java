package com.spdock.dataAccess;

import com.spdock.entities.Customer;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {

    @Query("{\"bool\":\"{\"must\":[{\"match\":{\"customerName\": \"?0\"}}]}}")
    List<Customer> getByCustomQuery(String search);
}
