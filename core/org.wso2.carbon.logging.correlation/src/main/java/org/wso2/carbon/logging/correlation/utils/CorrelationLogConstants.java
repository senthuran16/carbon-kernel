/*
 *
 *   Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com) All Rights Reserved.
 *
 *   WSO2 LLC. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.logging.correlation.utils;

/**
 * Correlation log constants class.
 */
public class CorrelationLogConstants {

    // Config paths in Carbon.xml file
    public static final String CONFIG_PATH_ENABLE = "CorrelationLogs.enable";
    public static final String CONFIG_PATH_COMPONENTS = "CorrelationLogs.components";
    public static final String CONFIG_PATH_DENIED_THREADS = "CorrelationLogs.deniedThreads";
    public static final String CONFIG_PATH_COMPONENT_CONFIGS = "CorrelationLogs.componentConfigs";
    public static final String CORRELATION_LOGS_SYS_PROPERTY = "enableCorrelationLogs";
    public static final String DENIED_THREADS_SYS_PROPERTY = "org.wso2.CorrelationLogInterceptor.BlacklistedThreads";

    // Defaults
    public static final String[] DEFAULT_DENIED_THREADS = {
            "MessageDeliveryTaskThreadPool",
            "HumanTaskServer" ,
            "BPELServer",
            "CarbonDeploymentSchedulerThread"
    };
}
