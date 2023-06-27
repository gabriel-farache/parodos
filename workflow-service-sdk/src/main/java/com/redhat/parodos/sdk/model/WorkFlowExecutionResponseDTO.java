/*
 * Parodos Workflow Service API
 * This is the API documentation for the Parodos Workflow Service. It provides operations to execute assessments to determine infrastructure options (tooling + environments). Also executes infrastructure task workflows to call downstream systems to stand-up an infrastructure option.
 *
 * The version of the OpenAPI document: v1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.redhat.parodos.sdk.model;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.redhat.parodos.sdk.invoker.JSON;

/**
 * WorkFlowExecutionResponseDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkFlowExecutionResponseDTO {

	public static final String SERIALIZED_NAME_WORK_FLOW_EXECUTION_ID = "workFlowExecutionId";

	@SerializedName(SERIALIZED_NAME_WORK_FLOW_EXECUTION_ID)
	private UUID workFlowExecutionId;

	/**
	 * Gets or Sets workStatus
	 */
	@JsonAdapter(WorkStatusEnum.Adapter.class)
	public enum WorkStatusEnum {

		FAILED("FAILED"),

		COMPLETED("COMPLETED"),

		IN_PROGRESS("IN_PROGRESS"),

		REJECTED("REJECTED"),

		PENDING("PENDING");

		private String value;

		WorkStatusEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static WorkStatusEnum fromValue(String value) {
			for (WorkStatusEnum b : WorkStatusEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		public static class Adapter extends TypeAdapter<WorkStatusEnum> {

			@Override
			public void write(final JsonWriter jsonWriter, final WorkStatusEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public WorkStatusEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return WorkStatusEnum.fromValue(value);
			}

		}

	}

	public static final String SERIALIZED_NAME_WORK_STATUS = "workStatus";

	@SerializedName(SERIALIZED_NAME_WORK_STATUS)
	private WorkStatusEnum workStatus;

	public WorkFlowExecutionResponseDTO() {
	}

	public WorkFlowExecutionResponseDTO workFlowExecutionId(UUID workFlowExecutionId) {

		this.workFlowExecutionId = workFlowExecutionId;
		return this;
	}

	/**
	 * Get workFlowExecutionId
	 * @return workFlowExecutionId
	 **/
	@javax.annotation.Nullable
	public UUID getWorkFlowExecutionId() {
		return workFlowExecutionId;
	}

	public void setWorkFlowExecutionId(UUID workFlowExecutionId) {
		this.workFlowExecutionId = workFlowExecutionId;
	}

	public WorkFlowExecutionResponseDTO workStatus(WorkStatusEnum workStatus) {

		this.workStatus = workStatus;
		return this;
	}

	/**
	 * Get workStatus
	 * @return workStatus
	 **/
	@javax.annotation.Nullable
	public WorkStatusEnum getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(WorkStatusEnum workStatus) {
		this.workStatus = workStatus;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WorkFlowExecutionResponseDTO workFlowExecutionResponseDTO = (WorkFlowExecutionResponseDTO) o;
		return Objects.equals(this.workFlowExecutionId, workFlowExecutionResponseDTO.workFlowExecutionId)
				&& Objects.equals(this.workStatus, workFlowExecutionResponseDTO.workStatus);
	}

	@Override
	public int hashCode() {
		return Objects.hash(workFlowExecutionId, workStatus);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WorkFlowExecutionResponseDTO {\n");
		sb.append("    workFlowExecutionId: ").append(toIndentedString(workFlowExecutionId)).append("\n");
		sb.append("    workStatus: ").append(toIndentedString(workStatus)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the
	 * first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	public static HashSet<String> openapiFields;

	public static HashSet<String> openapiRequiredFields;

	static {
		// a set of all properties/fields (JSON key names)
		openapiFields = new HashSet<String>();
		openapiFields.add("workFlowExecutionId");
		openapiFields.add("workStatus");

		// a set of required properties/fields (JSON key names)
		openapiRequiredFields = new HashSet<String>();
	}

	/**
	 * Validates the JSON Object and throws an exception if issues found
	 * @param jsonObj JSON Object
	 * @throws IOException if the JSON Object is invalid with respect to
	 * WorkFlowExecutionResponseDTO
	 */
	public static void validateJsonObject(JsonObject jsonObj) throws IOException {
		if (jsonObj == null) {
			if (!WorkFlowExecutionResponseDTO.openapiRequiredFields.isEmpty()) { // has
																					// required
																					// fields
																					// but
																					// JSON
																					// object
																					// is
																					// null
				throw new IllegalArgumentException(String.format(
						"The required field(s) %s in WorkFlowExecutionResponseDTO is not found in the empty JSON string",
						WorkFlowExecutionResponseDTO.openapiRequiredFields.toString()));
			}
		}

		Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
		// check to see if the JSON string contains additional fields
		for (Entry<String, JsonElement> entry : entries) {
			if (!WorkFlowExecutionResponseDTO.openapiFields.contains(entry.getKey())) {
				throw new IllegalArgumentException(String.format(
						"The field `%s` in the JSON string is not defined in the `WorkFlowExecutionResponseDTO` properties. JSON: %s",
						entry.getKey(), jsonObj.toString()));
			}
		}
		if ((jsonObj.get("workFlowExecutionId") != null && !jsonObj.get("workFlowExecutionId").isJsonNull())
				&& !jsonObj.get("workFlowExecutionId").isJsonPrimitive()) {
			throw new IllegalArgumentException(String.format(
					"Expected the field `workFlowExecutionId` to be a primitive type in the JSON string but got `%s`",
					jsonObj.get("workFlowExecutionId").toString()));
		}
		if ((jsonObj.get("workStatus") != null && !jsonObj.get("workStatus").isJsonNull())
				&& !jsonObj.get("workStatus").isJsonPrimitive()) {
			throw new IllegalArgumentException(String.format(
					"Expected the field `workStatus` to be a primitive type in the JSON string but got `%s`",
					jsonObj.get("workStatus").toString()));
		}
	}

	public static class CustomTypeAdapterFactory implements TypeAdapterFactory {

		@SuppressWarnings("unchecked")
		@Override
		public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
			if (!WorkFlowExecutionResponseDTO.class.isAssignableFrom(type.getRawType())) {
				return null; // this class only serializes 'WorkFlowExecutionResponseDTO'
								// and its subtypes
			}
			final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
			final TypeAdapter<WorkFlowExecutionResponseDTO> thisAdapter = gson.getDelegateAdapter(this,
					TypeToken.get(WorkFlowExecutionResponseDTO.class));

			return (TypeAdapter<T>) new TypeAdapter<WorkFlowExecutionResponseDTO>() {
				@Override
				public void write(JsonWriter out, WorkFlowExecutionResponseDTO value) throws IOException {
					JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
					elementAdapter.write(out, obj);
				}

				@Override
				public WorkFlowExecutionResponseDTO read(JsonReader in) throws IOException {
					JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
					validateJsonObject(jsonObj);
					return thisAdapter.fromJsonTree(jsonObj);
				}

			}.nullSafe();
		}

	}

	/**
	 * Create an instance of WorkFlowExecutionResponseDTO given an JSON string
	 * @param jsonString JSON string
	 * @return An instance of WorkFlowExecutionResponseDTO
	 * @throws IOException if the JSON string is invalid with respect to
	 * WorkFlowExecutionResponseDTO
	 */
	public static WorkFlowExecutionResponseDTO fromJson(String jsonString) throws IOException {
		return JSON.getGson().fromJson(jsonString, WorkFlowExecutionResponseDTO.class);
	}

	/**
	 * Convert an instance of WorkFlowExecutionResponseDTO to an JSON string
	 * @return JSON string
	 */
	public String toJson() {
		return JSON.getGson().toJson(this);
	}

}
