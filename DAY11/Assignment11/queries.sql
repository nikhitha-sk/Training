CREATE DATABASE InsuranceDB;
USE InsuranceDB;

CREATE TABLE Customer (
    CustomerID VARCHAR(5) PRIMARY KEY,
    CustomerName VARCHAR(50),
    DOB DATE,
    ContactNo VARCHAR(15)
);

CREATE TABLE PolicyType (
    PolicyType VARCHAR(20) PRIMARY KEY,
    PremiumRate DECIMAL(5,2),
    CoverageYears INT
);

CREATE TABLE Branch (
    BranchID VARCHAR(5) PRIMARY KEY,
    BranchName VARCHAR(50),
    Manager VARCHAR(50)
);

CREATE TABLE Policy (
    PolicyID VARCHAR(5) PRIMARY KEY,
    CustomerID VARCHAR(5),
    PolicyType VARCHAR(20),
    PremiumAmount DECIMAL(10,2),
    BranchID VARCHAR(5),
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID),
    FOREIGN KEY (PolicyType) REFERENCES PolicyType(PolicyType),
    FOREIGN KEY (BranchID) REFERENCES Branch(BranchID)
);

INSERT INTO Customer VALUES
('C1', 'Ramesh', '1985-05-10', '9876543210'),
('C2', 'Kavya', '1990-09-15', '9123456789');

INSERT INTO PolicyType VALUES
('Health', 5, 10),
('Life', 8, 20),
('Vehicle', 6, 5);

INSERT INTO Branch VALUES
('B1', 'Bangalore', 'Anil'),
('B2', 'Mysore', 'Sneha');

INSERT INTO Policy VALUES
('P1', 'C1', 'Health', 20000, 'B1'),
('P2', 'C1', 'Vehicle', 15000, 'B1'),
('P3', 'C2', 'Life', 50000, 'B2');

-- a. Maximum premium amount per branch
SELECT BranchID, MAX(PremiumAmount) AS MaxPremium
FROM Policy
GROUP BY BranchID;

-- b. Customers having more than one policy
SELECT CustomerID, COUNT(*) AS NumberOfPolicies
FROM Policy
GROUP BY CustomerID
HAVING COUNT(*) > 1;

-- c. Total annual premium payable per branch
SELECT BranchID, SUM(PremiumAmount) AS TotalPremium
FROM Policy
GROUP BY BranchID;