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

package org.wso2.carbon.logging.correlation;

import org.wso2.carbon.logging.correlation.bean.ImmutableCorrelationLogConfig;

/**
 * The class definition of the correlation log service class which needs to be implemented in each component.
 */
public interface CorrelationLogConfigurable {

    /**
     * Returns name of the implementation.
     *
     * @return
     */
    String getName();

    ImmutableCorrelationLogConfig getConfiguration();

    /**
     * Receives an instance of <code>ImmutableCorrelationLogConfig</code> class which holds the component-specific
     * configuration.
     *
     * @param config
     */
    void onConfigure(ImmutableCorrelationLogConfig config);
}