/*
 * Copyright 2018 lolnet.co.nz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nz.co.lolnet.direct.common.configuration.category;

public class StorageCategory {
    
    private String address = "localhost:3306";
    private String database = "direct";
    private String username = "direct";
    private String password = "password";
    private int maximumPoolSize = 2;
    private int minimumIdle = 1;
    
    public String getAddress() {
        return address;
    }
    
    public String getDatabase() {
        return database;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public int getMaximumPoolSize() {
        return maximumPoolSize;
    }
    
    public int getMinimumIdle() {
        return minimumIdle;
    }
}