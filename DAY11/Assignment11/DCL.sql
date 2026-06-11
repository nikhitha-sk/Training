CREATE USER 'branch_manager'@'localhost' IDENTIFIED BY 'branch123';
CREATE USER 'policy_auditor'@'localhost' IDENTIFIED BY 'audit123';
CREATE USER 'policy_admin'@'localhost' IDENTIFIED BY 'admin123';

-- a. branch_manager
GRANT INSERT, UPDATE ON InsuranceDB.Policy
TO 'branch_manager'@'localhost';

-- Login as branch_manager
INSERT INTO Policy VALUES
('P4', 'C2', 'Health', 25000, 'B2');

REVOKE UPDATE ON InsuranceDB.Policy
FROM 'branch_manager'@'localhost';

-- Login as branch_manager
UPDATE Policy
SET PremiumAmount = 30000
WHERE PolicyID = 'P4';

-- b. policy_auditor
GRANT SELECT ON InsuranceDB.Policy
TO 'policy_auditor'@'localhost';

-- Login as policy_auditor
SELECT * FROM Policy;

-- Login as policy_auditor
INSERT INTO Policy VALUES
('P5', 'C1', 'Life', 40000, 'B1');

-- c. policy_admin
GRANT ALL PRIVILEGES ON InsuranceDB.*
TO 'policy_admin'@'localhost'
WITH GRANT OPTION;

-- Login as policy_admin
DROP TABLE PolicyType;

-- Login as policy_admin
GRANT SELECT ON InsuranceDB.Customer
TO 'policy_auditor'@'localhost';

FLUSH PRIVILEGES;