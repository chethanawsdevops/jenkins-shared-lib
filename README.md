# Jenkins Shared Library (FAANG-grade)

## Usage

```groovy
@Library('shared-lib') _
ciPipeline(service: 'payment', deploy: true, env: 'staging')
```

## Structure
- vars/ : Pipeline entry points
- src/  : Groovy classes
- resources/ : Templates