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
package org.apache.camel.kamelets.catalog.model;

public enum KameletPrefixSchemeEnum {
    aws_cloudwatch("aws-cloudwatch","aws2-cw"),
    aws_ddb("aws-ddb","aws2-ddb"),
    aws_ddb_streams("aws-ddb","aws2-ddbstream"),
    aws_ec2("aws-ec2","aws2-ec2"),
    aws_eventbridge("aws-eventbridge","aws2-eventbridge"),
    aws_lambda("aws-lambda","aws2-lambda"),
    aws_redshift("aws-redshift","sql"),
    aws_s3("aws-s3","aws2-s3"),
    aws_secrets_manager("aws-secrets-manager","aws-secrets-manager"),
    aws_ses("aws-ses","aws2-ses"),
    aws_sns("aws-sns","aws2-sns"),
    aws_sns_fifo("aws-sns-fifo","aws2-sns"),
    aws_sqs("aws-sqs","aws2-sqs"),
    aws_sqs_batch("aws-sqs-batch","aws2-sqs"),
    aws_sqs_fifo("aws-sqs-fifo","aws2-sqs"),
    azure_eventhubs("azure-eventhubs","azure-eventhubs"),
    azure_functions("azure-functions","vertx-http"),
    azure_servicebus("azure-servicebus","azure-servicebus"),
    azure_storage_blob("azure-storage-blob","azure-storage-blob"),
    azure_storage_blob_changefeed("azure-storage-blob-changefeed","azure-storage-blob"),
    azure_storage_queue("azure-storage-queue","azure-storage-queue"),
    beer("beer", "http"),
    bitcoin("bitcoin", "xchange"),
    cassandra("cassandra", "cql"),
    ceph("ceph", "aws2-s3"),
    chuck_norris("chuck-norris", "http"),
    couchbase("couchbase", "couchbase"),
    dropbox("dropbox", "dropbox"),
    elasticsearch_rest_index("elasticsearch-index", "elasticsearch-rest"),
    elasticsearch_rest_search("elasticsearch-search", "elasticsearch-rest"),
    exec("exec", "exec"),
    fhir("fhir", "fhir"),
    file_watch("file-watch", "file-watch"),
    ftp("ftp", "ftp"),
    ftps("ftps", "ftps"),
    github_commit("github-commit", "github"),
    github_event("github-event", "github"),
    github_pr_comments("github-pullrequest-comment", "github"),
    github_pr("github-pullrequest", "github"),
    github_tag("github-tag", "github"),
    google_bigquery("google-bigquery", "google-bigquery"),
    google_calendar("google-calendar", "google-calendar-stream"),
    google_functions("google-functions", "google-functions"),
    google_mail("google-mail", "google-mail-stream"),
    google_pubsub("google-pubsub", "google-pubsub"),
    google_sheets("google-sheets", "google-sheets-stream"),
    google_storage("google-storage", "google-storage"),
    http("http", "http"),
    http_secured("http-secured", "http"),
    infinispan("infinispan", "infinispan");

    public final String name;
    public final String scheme;

    private KameletPrefixSchemeEnum(String name, String scheme) {
        this.name = name;
        this.scheme = scheme;
    }
}
