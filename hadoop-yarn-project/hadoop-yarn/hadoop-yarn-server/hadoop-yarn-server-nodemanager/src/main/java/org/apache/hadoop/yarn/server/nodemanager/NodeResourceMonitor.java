/**
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.apache.hadoop.yarn.server.nodemanager;

import org.apache.hadoop.service.Service;
import org.apache.hadoop.yarn.api.records.ResourceUtilization;

/**
 * Interface for monitoring the resources of a node.
 */
public interface NodeResourceMonitor extends Service {
  /**
   * Get the <em>resource utilization</em> of the node.
   * @return <em>resource utilization</em> of the node.
   */
  public ResourceUtilization getUtilization();
  
  
  //get available usable memory
  public long getAvailableMemory();
  
  //at this point we should kill user applications
  public boolean isNodeOOM();
  
}
