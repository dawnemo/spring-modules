/*
 * Copyright 2004-2005 the original author or authors.
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

package org.springmodules.validation.util.fel;

/**
 * Thrown by {@link Function#evaluate(Object)} when the evaluation of the function fails.
 *
 * @author Uri Boness
 */
public class FelEvaluationException extends FelException {

    /**
     * Construct a <code>NestedRuntimeException</code> with the specified detail message.
     *
     * @param msg the detail message
     */
    public FelEvaluationException(String msg) {
        super(msg);
    }

    /**
     * Construct a <code>NestedRuntimeException</code> with the specified detail message
     * and nested exception.
     *
     * @param msg the detail message
     * @param ex the nested exception
     */
    public FelEvaluationException(String msg, Throwable ex) {
        super(msg, ex);
    }

}
