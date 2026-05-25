-- Last updated: 5/25/2026, 7:18:35 PM
UPDATE salary SET sex =
CASE sex
    WHEN 'm' THEN 'f'
    ELSE 'm'
END;