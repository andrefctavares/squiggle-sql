/*
 * Copyright 2004-2015 Joe Walnes, Guillaume Chauvet.
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
package com.zatarox.squiggle.criteria;

import com.zatarox.squiggle.Criteria;
import com.zatarox.squiggle.Table;
import com.zatarox.squiggle.output.Output;

import java.util.Set;

/**
 * Class NoCriteria is a Criteria that represents an absent operand in an SQL
 * predicate expression so that one may represent a unary operator (for example,
 * {@link NOT}) using a binary operator derived from a {@link BaseLogicGroup}).
 */
public class NoCriteria implements Criteria {

    /**
     * Writes an empty criteria (single space) to the given output stream.
     *
     * @see
     * com.zatarox.squiggle.Criteria#write(com.zatarox.squiggle.output.Output)
     */
    public void write(Output out) {
        out.print(' ');
    }

    public void addReferencedTablesTo(Set<Table> tables) {
    }
}