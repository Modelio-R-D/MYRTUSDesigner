/**
 * Java Class : IPropertyContent.java
 *
 * Description :
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing,
 *    software distributed under the License is distributed on an
 *    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *    KIND, either express or implied.  See the License for the
 *    specific language governing permissions and limitations
 *    under the License.
 *
 * @category   Util
 * @package    com.modeliosoft.modelio.sysml.utils
 *   @author     Modelio
 * @license    http://www.apache.org/licenses/LICENSE-2.0
 * @version    2.0.08
 */
package fr.softeam.toscadesigner.handlers.propertypages;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This interface defines the contract of all property pages
 */
@objid ("35d19e45-5906-45ec-b5f7-428a42329c72")
public interface IPropertyContent {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("ec859bac-8856-4ecd-899a-6b21df6dd192")
    void changeProperty(int row, String value);

    /**
     * This method handles the construction of the property table of a selected element
     * @param table : the property table to fulfill
     */
    @objid ("e428b814-eb93-407d-a165-cd7885464aa1")
    void update(IModulePropertyTable table);
}

