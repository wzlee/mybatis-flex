/*
 *  Copyright (c) 2022-2023, Mybatis-Flex (fuhai999@gmail.com).
 *  <p>
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  <p>
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  <p>
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.mybatisflex.core.audit;


public class ConsoleMessageCollector implements MessageCollector {

    private SqlDebugPrinter printer = (sql, tookTimeMillis) -> {
        if (tookTimeMillis != null) {
            System.out.println("Flex exec sql took " + tookTimeMillis + " ms >>>  " + sql);
        } else {
            System.out.println("Flex exec sql >>>  " + sql);
        }
    };

    public ConsoleMessageCollector() {
    }

    public ConsoleMessageCollector(SqlDebugPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void collect(AuditMessage message) {
        printer.print(message.getFullSql(), message.getElapsedTime());
    }

    public interface SqlDebugPrinter {
        void print(String sql, Long tookTimeMillis);
    }
}
