/* 
 * Created on Oct 19, 2004
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2004 the original author or authors.
 */

package org.springmodules.cache.interceptor.flush;

import java.lang.reflect.Method;

/**
 * <p>
 * Interface used by <code>{@link MetadataFlushingInterceptor}</code> to retrieve
 * the <code>{@link FlushCache}</code> attribute that belongs to the
 * intercepted method.
 * </p>
 * 
 * @author Alex Ruiz
 */
public interface FlushingAttributeSource {

  /**
   * Returns an instance of <code>{@link FlushCache}</code> attribute from the
   * intercepted method.
   * 
   * @param method
   *          the intercepted method.
   * @param targetClass
   *          the target class. May be null, in which case the declaring class
   *          of the method must be used.
   * @return a metadata attribute from the intercepted method.
   */
  FlushCache getFlushingAttribute(Method method, Class targetClass);
}