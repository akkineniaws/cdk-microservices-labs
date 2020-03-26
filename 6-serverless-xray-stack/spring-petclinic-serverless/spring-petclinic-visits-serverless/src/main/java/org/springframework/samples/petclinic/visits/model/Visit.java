/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.visits.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.UUID;
import java.util.Date;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonFormat;

@DynamoDBTable(tableName = "VISIT")
public class Visit {

   
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
	private UUID id;
	
    private Date date;
    
    private String petName;
    private String ownerId;
    private String description;
    
    public Visit(){
        
    }
    
    public UUID getId(){
        return id;
    }
    
    public void setId(UUID id){
        this.id = id;
    }
    
    public Visit(String ownerId, String petName, Date date){
        this.petName = petName;
        this.ownerId = ownerId;
        this.date = date;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date){
        this.date = date;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(final String petName) {
        this.petName = petName;
    }
    
    public String getOwnerId(){
        return ownerId;
    }
    
    public void setOwnerId(String ownerId){
        this.ownerId = ownerId;
    }

}
