This is a reproducer for a false positive on rule S1989, reported on ticket 62332.

```bash
mvn compile sonar:sonar -Dsonar.host.url=http://localhost:9000 &> log
```

![Issue on local SonarQube](/image.png)