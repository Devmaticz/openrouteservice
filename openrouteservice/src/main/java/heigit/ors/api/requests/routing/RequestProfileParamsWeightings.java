/*
 * This file is part of Openrouteservice.
 *
 * Openrouteservice is free software; you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this library;
 * if not, see <https://www.gnu.org/licenses/>.
 */

package heigit.ors.api.requests.routing;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jdk.nashorn.internal.ir.annotations.Ignore;

@ApiModel(value = "Profile Weightings", parent = RequestProfileParams.class, description = "Describe additional weightings to be applied to edges on the routing.")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class RequestProfileParamsWeightings {
    @ApiModelProperty(value = "Specifies the fitness level for cycling-* profiles.\n" +
            "\n level: 0 = Novice, 1 = Moderate, 2 = Amateur, 3 = Pro. The prefered gradient increases with level.\n[{profile=[bike-*]}]", example = "2")
    @JsonProperty("steepness_difficulty")
    private Integer steepnessDifficulty;
    @Ignore
    private boolean hasSteepnessDifficulty = false;

    @ApiModelProperty(value = "Specifies the Green factor for foot-* profiles.\n" +
            "\nfactor: Values range from 0 to 1. 0 equals normal routing. 1 will prefer ways through green areas over a shorter route.\n[{profile=[foot-*]}]", example = "0.4")
    @JsonProperty("green")
    private Float greenIndex;
    @Ignore
    private boolean hasGreenIndex = false;

    @ApiModelProperty(value = "Specifies the Quiet factor for foot-* profiles.\n" +
            "\nfactor: Values range from 0 to 1. 0 equals normal routing. 1 will prefer quiet ways over a shorter route.\n[{profile=[foot-*]}]", example = "0.8")
    @JsonProperty("quiet")
    private Float quietIndex;
    @Ignore
    private boolean hasQuietIndex = false;

    public Integer getSteepnessDifficulty() {
        return steepnessDifficulty;
    }

    public void setSteepnessDifficulty(Integer steepnessDifficulty) {
        this.steepnessDifficulty = steepnessDifficulty;
        hasSteepnessDifficulty = true;
    }

    public Float getGreenIndex() {
        return greenIndex;
    }

    public void setGreenIndex(Float greenIndex) {
        this.greenIndex = greenIndex;
        hasGreenIndex = true;
    }

    public Float getQuietIndex() {
        return quietIndex;
    }

    public void setQuietIndex(Float quiteIndex) {
        this.quietIndex = quiteIndex;
        hasQuietIndex = true;
    }

    public boolean hasSteepnessDifficulty() {
        return hasSteepnessDifficulty;
    }

    public boolean hasGreenIndex() {
        return hasGreenIndex;
    }

    public boolean hasQuietIndex() {
        return hasQuietIndex;
    }
}