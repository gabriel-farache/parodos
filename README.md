# What Is Parodos?

Parodos is a Java toolkit to help enterprise's with a legacy footprint build internal developer platforms (IDP) that enable their developers to get access to the tools and environments required to start coding with less time, friction and frustration.

This repository contains the backing services for Parodos. The user interface for Parodos is Backstage (https://backstage.io/) plugins that will be contributed to Red Hat's Janus-IDP initiative.
https://github.com/janus-idp

The focus of Parodos is around workflows (composed of WorkFlowTasks) that bring together the existing tools and process of the enterpise in an end to end experience that developers, quality assurance, produnction support and other enterprise software development/delivery team members can use to get the outcomes they need with less tickets/meetings/frustration.


# Building Developer Platforms In Enterprise Environments

Building an IDP provides a centralized place to improve the experience for developers trying to build and release code in large environments. 

For many enterprise environments, especially regulated ones, the source of some friction with a positive developer experience is that they are entangled with long standing processes and tools which are tied to audit, compliance and regulation. These components are often:

- Unique to the enterprise
- Providing a necessary safeguard
- Difficult to change or remove

For more thoughts and opinions on the challenges in making changes to an existing software culture in an enterprise environment, please review the following blog: https://www.redhat.com/en/blog/modernization-why-is-it-hard

For more information about building IDPs in regulated enterprise environments, review the following:
https://www.redhat.com/en/blog/considerations-when-implementing-developer-portals-regulated-enterprise-environments

# The Focus Of Parodos

Although frameworks and ecosystems might exist to help build developer portals, getting some of these approved for production use in certain enterprises, especially if they have a large ecosystem written by disparate developers, might be difficult. Also, some enterprises may struggle with Javascript heavy approaches. That is not to say such libraries, frameworks and platforms are not suited for the task. On the contrary they might be just what is needed, but a chasm might exist to fully adopt in an enterprise environment that has legacy technology and processes.

Parodos is ancient Greek and translates to 'a side-entrance to the stage'. In this theme, Parodos provides Java based building blocks to bring together backend processes and components that might be considered more 'legacy' as workflows that can be consumed in Backstage.

The most common usecase for Parodos is giving developers a place where they can provide inputs for Assessments (ie: a link to their project code and/or an application identifying code), and based on logic determined by the enterprise a list of Workflows are presented to them. Examples might be:

- Upgrade to existing tool stack and environments to newer versions
- Migrate to new tooling and environments
- Onboard for the first time to tooling and environments
- Add/Remove developers to a project
- Change properties of an environment (ie: add more memory to QA)

Developers will be presented with simple Wizard based steppers that collect information as needed and update them of any back-end approvals that are kicked off during the workflow which might result in a pause in the workflow. In the backend Parodos will be calling the exact tooling to create enterprises approved blueprints for that specific use case.

# Who Is Parodos For?

The following describes who would benefit the most from Parodos:

1. Enterprises that are struggling logistically (or technically due to challenges hiring in a specific technology stack) Javascript heavy products in the developer portal space

2. Teams that are comfortable building and operating a custom Java based application

3. Environments where there are existing tools for building, deploying and observing application that can be integrated with

If all of these exist, your enterprise may benefit from using Parodos to build some workflows to help developers deliver code faster.

## Parodos Components

Parodos is composed of the following components

### Infrastructure Workflow

This workflow provides the following configurable steps:

- Assessment of the code/configuration of an application
- Provides options to the user of what tools and environments they can get for their application (newly created, upgrade, migrate to new)
- Hooks for existing infrastructure teams to begin work to create/update environments
- Hooks for observability into what is being created

### Deployment Workflow

This workflow provides an abstraction from the underlying tooling allowing a developer to:

- Observe the status of a build
- Determine where the build is running
- Initiate the promotion of the build to another environment (if they have the permissions)
- Change the configuration deployment and re-run it on the same environment
- When a deploy/build fails, get details on exactly where to trouble shoot

There are also some other helpful workflows that can be included that are useful to the two listed.

#### Notification Workflow

Read only messages related to downstream processes. Useful for those team members who might not have access to other commonly used communication systems (like Slack).

#### Training Workflow

A simple view of training that is assigned and why it has been assigned. The idea is to trigger assignments based on events (ie: migrating to new platform)

#### Project History

A simple system for posting events related to an artifact (generally a packaged version of a the code base) to a central system that can be easily displayed

**These workflows integrate with existing tools and processes in an enterprise environment, none of the outcomes listed above can be achieved by Parodos without integrating with existing tools.**

## Using A Parodos Workflow

Parodos provides contracts for API endpoints (and underlying services), along with some pre-baked logic, as a starting point for an API layer application that integrates with existing tools and processes in the enterprise to get code moving towards production. On top of this we have provided user interfaces that are powered by these API. All is meant to be configured and customized to suite the specific needs of the team(s) intending to use it.


Taking this base, and further customizing it, a team will end up with a JVM based application that can be run as a stand alone, or as Backstage.io plugins.

## Is Parodos an Application?

No, Parodos is the scaffolding to build a custom application that can be stand-alone Workflows or integrate with Backstage as a plugin. It provides a React UI layer, and Java API layer that will need to be customized to suit the needs of the enterprise.

## Deployment Models

### Stand Alone Monolithic

In this case a workflow will be packaged as a single Jar containing both the React and Java

### Backstage Plugin

In this case the React UI can be deployed as a Backstage plugin. This is useful when trying Parodos workflows together, or when leveraging other components in the Backstage ecosystem

More details to come as the project evolves

# Using the Repository

This repository is a mono-repo containing all possibly code.  The directories are as follows: 

* **./docs** - Contains all documentation that is not specific to anyone component of parodos.
* **./implementation-examples** - Contains example implementation and integrations of parodos with other technologies.
* **./services** - RESTful services ready for usage.
* **./usecases** - Individual tasks which make up the units of work for a workflow.
* **./workflow-engine** - The engine which powers the workflow execution.
* **./workflows** - Pre-configured workflows composed of units of work from the usecases.


# Authors

Bill Bensing (GitHub: @BillBensing | LinkedIn:https://www.linkedin.com/in/billbensing/ | Twitter: @BillBensing)

Luke Shannon (GitHub: lshannon)
