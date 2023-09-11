/*
 * Copyright (C) 2021 Michael Clarke
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 */
package com.github.mc1arke.sonarqube.plugin.almclient.azuredevops.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Repository {

    private final String remoteUrl;
    private final String name;
    private final Project project;

    @JsonCreator
    public Repository(@JsonProperty("remoteUrl") String remoteUrl, @JsonProperty("name") String name,
                      @JsonProperty("project") Project project) {
        this.remoteUrl = remoteUrl;
        this.name = name;
        this.project = project;
    }

    public String getRemoteUrl() {
        return remoteUrl;
    }

    public String getName() {
        return name;
    }

    public Project getProject() {
        return project;
    }
}
