/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.karaf.config.command;

import org.apache.karaf.shell.commands.Argument;
import org.apache.karaf.shell.commands.Command;

import java.util.Dictionary;

@Command(scope = "config", name = "property-get", description = "Gets a property value in the currently edited configuration.")
public class PropGetCommand extends ConfigPropertyCommandSupport {

    @Argument(index = 0, name = "property", description = "The name of the property to get the value for", required = true, multiValued = false)
    String prop;

    @Override
    public void propertyAction(Dictionary props) {
        System.out.println(props.get(prop));
    }

}
