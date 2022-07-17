package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SEPA Informations
 */
@Schema(description = "SEPA Informations")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-17T18:22:11.279Z[GMT]")


public class WireTransfertResource   {
  @JsonProperty("rum")
  private String rum = null;

  public WireTransfertResource rum(String rum) {
    this.rum = rum;
    return this;
  }

  /**
   * Référence Unique de Mandat
   * @return rum
   **/
  @Schema(example = "RUM08918098739762ABCGDF65524255658", description = "Référence Unique de Mandat")
  
    public String getRum() {
    return rum;
  }

  public void setRum(String rum) {
    this.rum = rum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WireTransfertResource wireTransfertResource = (WireTransfertResource) o;
    return Objects.equals(this.rum, wireTransfertResource.rum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WireTransfertResource {\n");
    
    sb.append("    rum: ").append(toIndentedString(rum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
