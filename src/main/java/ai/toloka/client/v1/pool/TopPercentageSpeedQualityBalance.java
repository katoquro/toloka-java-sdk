/*
 * Copyright 2021 YANDEX LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ai.toloka.client.v1.pool;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TopPercentageSpeedQualityBalance extends AbstractSpeedQualityBalance {

    @JsonProperty("percent")
    private Integer percent;

    public TopPercentageSpeedQualityBalance(@JsonProperty("percent") Integer percent) {
        super(Type.TOP_PERCENTAGE_BY_QUALITY);
        this.percent = percent;
    }

    public Integer getPercent() {
        return percent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        TopPercentageSpeedQualityBalance that = (TopPercentageSpeedQualityBalance) o;
        return Objects.equals(percent, that.percent);
    }

    @Override
    public int hashCode() {
        return percent.hashCode();
    }

    @Override
    public String toString() {
        return "TopPercentageUsersCherryPickingConfig{"
                + "type=" + type
                + ", percent=" + percent
                + '}';
    }
}
