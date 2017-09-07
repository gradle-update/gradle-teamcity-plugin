/*
 * Copyright 2015 Rod MacKenzie
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.rodm.teamcity

import groovy.transform.CompileStatic
import org.gradle.api.tasks.Input

/**
 * Executable files
 */
@CompileStatic
class ExecutableFiles {

    List<String> includes = []

    @Input
    List<String> getIncludes() {
        return includes
    }

    /**
     * Add a path to an executable.
     *
     * @param path The relative path of a file to be set as executable after unpacking.
     */
    void include(String path) {
        includes << path
    }

    boolean hasFiles() {
        return includes.size() > 0
    }
}
