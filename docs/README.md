# StartUp - Android Library

## Intro
StartUp provides a straightforward, performant way to initialize components (from library and/or application) at application startup.

## Getting Started
For information on how to get started with Flow Kit,
take a look at our [Getting Started](docs/getting-started.md) guide.

## Submitting Bugs or Feature Requests
Bugs or feature requests should be submitted at our [GitHub Issues section](https://github.com/zeoflow/startup/issues).

## How does it work?
### 1. Depend on our library

StartUp for Android is available through Maven's Repository.
To use it:

1.  Open the `build.gradle` file for your application.
2.  Make sure that the `repositories` section includes Maven's Repository
    `mavenCentral()`. For example:

    ```groovy
      allprojects {
        repositories {
          mavenCentral()
        }
      }
    ```

3.  Add the library to the `dependencies` section:

    ```groovy
      dependencies {
        // ...
        implementation 'com.zeoflow:startup:1.0.0'
        // ...
      }
    ```
    
## License
    Copyright 2020 ZeoFlow
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
      http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

## 🏆 Contributors 🏆

<!-- ZEOBOT-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<p float="left">
<a href="docs/contributors.md#pushpin-teodor-g-teodorhmx1"><img width="100" src="https://avatars.githubusercontent.com/u/22307006?v=4" hspace=5 title='Teodor G. (@TeodorHMX1) - click for details about the contributions'></a>
</p>

<!-- markdownlint-enable -->
<!-- prettier-ignore-end -->
<!-- ZEOBOT-LIST:END -->