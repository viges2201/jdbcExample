CREATE TABLE EMPL_PROJ
(
  EMPLOYEE_ID BIGINT NOT NULL ,
  PROJECT_ID BIGINT NOT NULL ,
  CONSTRAINT EMPL_PROJ_EMPLOYEE_ID_FKEY FOREIGN KEY (EMPLOYEE_ID) REFERENCES  EMPLOYEE (ID),
  CONSTRAINT EMPL_PROJ_PROJ_ID_FKEY FOREIGN KEY (PROJECT_ID) REFERENCES PROJECT (ID)
)