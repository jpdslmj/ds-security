## 运行步骤

- 启动redis、mysql以及nacos注册中心
- 依次运行数据库脚本：
    - ds-admin/db/init.sql
    - ds-auth-server/db/init.sql
- 依次配置修改并导入nacos注册中心：
    - ds-auth-server/src/main/resources/application.yml
    - ds-admin/src/main/resources/application.yml
    - ds-gateway/src/main/resources/application.yml
- 按顺序运行main类：
    - AuthBootstrap（ds-auth-server）
    - AdminBootstrap（ds-admin）
    - GatewayServerBootstrap（ds-gate）